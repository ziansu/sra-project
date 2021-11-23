public void stop() {
    if ((mClient) == null) {
        android.util.Log.e(getClass().getName(), "locationclient can not be null before using is");
    }else {
        mClient.stop();
    }
}