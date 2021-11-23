private void setupGoogleLocationServices() {
    if ((mGoogleApiClient) == null) {
        mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
        try {
            android.location.Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
            mLastLocation = lastLocation;
        } catch (java.lang.SecurityException e) {
            android.widget.Toast.makeText(this, getString(R.string.error_location_not_supported), Toast.LENGTH_LONG).show();
        }
    }
}