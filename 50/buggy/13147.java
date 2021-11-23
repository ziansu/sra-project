public void start() {
    if ((mClient) == null) {
        android.util.Log.e(C.TAG, "locationclient can not be null before using is");
    }else {
        mClient.start();
    }
}