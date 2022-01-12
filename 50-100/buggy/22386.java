protected synchronized void buildGoogleApiClient() {
    android.util.Log.e("LocationNinja", "Inside: Building google API Client");
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    if ((!(isGPSEnabled())) && (!(isNetworkEnabled()))) {
        android.util.Log.e("LocatioNinja", "Showing alert dialog for enabling location");
        showSettingsAlert();
    }else
        mGoogleApiClient.connect();
    
}