protected synchronized void buildLocationClient() {
    if ((locationClient) == null) {
        locationClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).enableAutoManage(this, 1, this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    }
    locationClient.connect();
}