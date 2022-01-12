private void startTimer() {
    android.util.Log.i(LOG_TAG, "starting the timer in service");
    service.startTimer(cookTime);
    timerRunning = true;
    incTimeButton.setEnabled(false);
    decTimeButton.setEnabled(false);
    button.setText(getString(R.string.stop));
    resetButton.setEnabled(false);
}