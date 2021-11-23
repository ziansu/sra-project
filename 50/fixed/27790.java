@java.lang.Override
protected void onPause() {
    super.onPause();
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        stopLocationUpdates();
    }
}