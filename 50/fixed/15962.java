@java.lang.Override
protected void onPause() {
    super.onPause();
    if (mGoogleApiClient.isConnected()) {
        mGoogleApiClient.disconnect();
    }
}