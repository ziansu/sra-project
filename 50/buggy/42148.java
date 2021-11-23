@java.lang.Override
public void onTick(android.view.View view, long millisUntilFinished) {
    mCountDownTextView.setText(java.lang.String.valueOf(((millisUntilFinished + 999) / 1000)));
}