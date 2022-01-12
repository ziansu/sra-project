private void startTimer() {
    android.util.Log.i(LOG_TAG, "stopping the timer in service");
    service.stopTimer();
    timerRunning = false;
    button.setText(getString(R.string.start));
    incTimeButton.setEnabled(true);
    decTimeButton.setEnabled(true);
    resetButton.setEnabled(true);
}