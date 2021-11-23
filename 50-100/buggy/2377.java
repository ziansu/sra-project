@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Button btn = ((android.widget.Button) (v));
    if (begin) {
        begin = false;
        btn.setText("Begin");
        resetGame();
    }else {
        begin = true;
        btn.setText("Restart");
        currentNumber.setText("Game Start !");
    }
}