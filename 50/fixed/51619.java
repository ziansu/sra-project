@java.lang.Override
protected void onStop() {
    if (mGoogleApiClient.isConnected()) {
        stopPeriodicLocationUpdates();
    }
    mGoogleApiClient.disconnect();
    super.onStop();
}