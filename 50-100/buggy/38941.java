protected synchronized void buildGoogleApiClient() {
    android.util.Log.i("MapFragment", "Building GoogleApiClient");
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this.getContext()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    createLocationRequest();
}