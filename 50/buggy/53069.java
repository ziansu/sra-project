public void stopTimer() {
    handler.removeCallbacks(runnable);
    isStarted = false;
    wasStarted = false;
}