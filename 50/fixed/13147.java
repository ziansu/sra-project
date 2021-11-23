public void start() {
    if ((mClient) == null) {
        android.util.Log.e(getClass().getName(), "locationclient can not be null before using is");
    }else {
        mClient.start();
    }
}