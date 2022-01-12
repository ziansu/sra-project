public void onTick(long millisUntilFinished) {
    gameTimerView.setInnerBottomText("");
    questionTimerIsRunning = true;
    int progress = ((int) ((long) (millisUntilFinished / 1000)));
    if (progress <= 10) {
        gameTimerView.setProgress(progress);
    }
}