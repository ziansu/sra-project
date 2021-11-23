private void pause() {
    timePause = android.os.SystemClock.uptimeMillis();
    customHandler.removeCallbacks(updateTimerThread);
    shadow.setVisibility(View.VISIBLE);
    textRestart.setBackgroundResource(R.drawable.text);
    textResume.setBackgroundResource(R.drawable.text);
    game.setClickable(false);
    textPause.setClickable(false);
    btnYes.setClickable(false);
    btnNo.setClickable(false);
}