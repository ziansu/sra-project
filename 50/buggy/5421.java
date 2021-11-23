private void stopBackgroundThread() {
    mBackgroundHandlerThread.quitSafely();
    mBackgroundHandlerThread = null;
    mBackgroundHandler = null;
    try {
        mBackgroundHandlerThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}