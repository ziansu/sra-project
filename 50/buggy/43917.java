@java.lang.Override
public void onTick(long millisUntilFinished) {
    recordTask.reset();
    mTimeLeftText.setText(((java.lang.String.valueOf((millisUntilFinished / 1000.0))) + " s"));
    mIsRunning = true;
    mMillisUntilFinished = millisUntilFinished;
    playSound();
}