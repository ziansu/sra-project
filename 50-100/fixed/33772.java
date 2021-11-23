protected synchronized void buildGoogleApiClient() {
    android.util.Log.i(com.bsse0628.easybustracker.LocationUpdater.TAG, "Building GoogleApiClient");
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).enableAutoManage(this, this).addApi(Auth.GOOGLE_SIGN_IN_API, gso).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    createLocationRequest();
}