@java.lang.Override
public void onConnectionSuspended(int arg0) {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Drive.API).addScope(Drive.SCOPE_FILE).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
    mGoogleApiClient.connect();
}