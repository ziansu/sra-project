private void stopBackgroundThread() {
    mBackgroundHandlerThread.quitSafely();
    try {
        mBackgroundHandlerThread.join();
        mBackgroundHandlerThread = null;
        mBackgroundHandler = null;
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}