@java.lang.Override
public void onResume() {
    super.onResume();
    if (mGoogleApiClient.isConnected()) {
        setUpMapIfNeeded();
        startLocationUpdates();
    }
}