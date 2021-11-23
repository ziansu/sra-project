@java.lang.Override
public void onClick(android.view.View v) {
    (ballCounter)--;
    if ((counter) <= 0) {
        ballCounter = 0;
        display2.setText(("Your total is " + 0));
    }else {
        display2.setText(("Your total is " + (ballCounter)));
    }
}