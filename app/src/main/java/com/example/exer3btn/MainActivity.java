package com.example.exer3btn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

    }

    public void lol(View view) {
        x++;
        btn.setText("This is a click number:" + x);
        if (x==6)
        {
            btn.setText("Enough to click. Go to new start!");
            x=0;
        }

    }
}