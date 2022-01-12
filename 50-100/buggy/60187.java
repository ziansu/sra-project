public void onTick(long millisUntilFinished) {
    gameTimerView.setInnerBottomText("");
    questionTimerIsRunning = true;
    int progress = ((int) ((long) (millisUntilFinished / 1000)));
    android.util.Log.e(rocks.throw20.funwithcountries.GameActivityFragment.LOG_TAG, ("progress " + progress));
    if (progress <= 10) {
        gameTimerView.setProgress(progress);
    }
}