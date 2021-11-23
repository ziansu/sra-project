@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((rpsGame) != null) {
        rpsGame.pause();
        isProgressPaused(true);
    }
}