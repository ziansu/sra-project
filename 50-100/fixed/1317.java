private void pause() {
    timePause = android.os.SystemClock.uptimeMillis();
    customHandler.removeCallbacks(updateTimerThread);
    shadow.setVisibility(View.VISIBLE);
    game.setClickable(false);
    textPause.setClickable(false);
    btnYes.setClickable(false);
    btnNo.setClickable(false);
}