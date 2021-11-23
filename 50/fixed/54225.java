private void stopBackgroundThread() {
    if ((backgroundThread) != null) {
        backgroundThread.quitSafely();
        backgroundThread = null;
        backgroundHandler = null;
    }
}