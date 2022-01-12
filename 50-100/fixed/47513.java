@java.lang.Override
protected void onResume() {
    super.onResume();
    if (mGoogleApiClient.isConnected()) {
        isConnectedToNetwork();
        if (mRequestingLocationUpdates) {
            startLocationUpdates();
        }
    }else {
        if (isConnectedToNetwork()) {
            if (checkPlayServices()) {
                mGoogleApiClient.connect();
            }else {
                showGooglePlayServicesUnavailableDialog();
            }
        }
    }
}