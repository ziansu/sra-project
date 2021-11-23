@java.lang.Override
public void onTick(long millisUntilFinished) {
    progress = ((int) (millisUntilFinished / 1000));
    button.setEnabled(false);
    textview.setText(java.lang.Integer.toString(progress));
}