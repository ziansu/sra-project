private synchronized void buildGoogleApiClient() {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).enableAutoManage(this, this).build();
}