@java.lang.Override
public void onClick(android.view.View v) {
    if ((ballCounter) <= 0) {
        ballCounter = 0;
        display2.setText(("Your total is " + (ballCounter)));
    }else {
        (ballCounter)--;
        display2.setText(("Your total is " + (ballCounter)));
    }
}