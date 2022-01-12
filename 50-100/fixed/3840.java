@java.lang.Override
public void onTick(long millisUntilFinished) {
    if (questionWasAnswered) {
        mCountDownTimer.cancel();
        return ;
    }
    android.animation.ObjectAnimator animation = android.animation.ObjectAnimator.ofInt(clockCounterProgressBar, "progress", clockIncrementAnimation);
    animation.setDuration(1000);
    animation.setInterpolator(new android.view.animation.DecelerateInterpolator());
    animation.start();
    tempTimer = ((int) (millisUntilFinished / 1000)) - 1;
    counterTextView.setText(java.lang.String.valueOf(((millisUntilFinished / 1000) - 1)));
    clockIncrementAnimation += 1000;
}