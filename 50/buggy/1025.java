@java.lang.Override
protected void onPause() {
    super.onPause();
    rpsGame.pause();
    isProgressPaused(true);
}