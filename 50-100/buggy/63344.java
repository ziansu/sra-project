public void disconnect() {
    android.util.Log.i(com.monmouth.fayePG.FayeService.LOG_TAG, "FayeService disconnect");
    if ((mClient) != null) {
        mClient.setShouldRetryConnection(false);
        mClient.disconnectFromServer();
    }
    if ((mHandlerThread) != null) {
        mHandlerThread.quitSafely();
    }
    mHandler = null;
    stopForeground(true);
}