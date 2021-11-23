private void openBackgroundThread() {
    backgroundThread = new android.os.HandlerThread("camera_background_thread");
    backgroundThread.start();
    backgroundHandler = new android.os.Handler(backgroundThread.getLooper());
}