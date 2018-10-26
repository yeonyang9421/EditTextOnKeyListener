package kr.co.woobi.imyeon.edittextonkeylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText plainText=(EditText)findViewById(R.id.plainText);
        plainText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if((event.getAction()==KeyEvent.ACTION_DOWN)&&(keyCode==KeyEvent.KEYCODE_ENTER)){
                    Toast.makeText(v.getContext(),plainText.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}
