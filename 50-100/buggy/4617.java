@java.lang.Override
protected void onResume() {
    android.util.Log.d(com.setmusic.bitmine.BitmineMainActivity.TAG, "onStart");
    super.onStart();
    if ((googleApiClient) != null) {
        googleApiClient.connect();
    }else {
        getLastLocation();
        createLocationRequest();
        storeLocation();
    }
}