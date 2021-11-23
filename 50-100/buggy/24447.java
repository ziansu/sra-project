private void close() {
    if (googleApiClient.isConnected()) {
        handler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                onGooglePlayServicesDisconnecting();
                googleApiClient.disconnect();
            }
        });
    }
    if ((handlerThread) != null) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN_MR2)) {
            handlerThread.quitSafely();
        }else {
            handlerThread.quit();
        }
        handlerThread.interrupt();
    }
}