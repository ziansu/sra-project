public void onTick(long millisUntilFinished) {
    weightTimerText.setText(((n) + ""));
    weightTimerProgressBar.setProgress(((10 - (n)) * 10));
    (n)--;
}