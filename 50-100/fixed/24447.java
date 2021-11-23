private void close() {
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (googleApiClient.isConnected()) {
                onGooglePlayServicesDisconnecting();
            }
            googleApiClient.disconnect();
        }
    });
    if ((handlerThread) != null) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN_MR2)) {
            handlerThread.quitSafely();
        }else {
            handlerThread.quit();
        }
        handlerThread.interrupt();
    }
}