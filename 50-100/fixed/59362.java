@java.lang.Override
public void onCreate() {
    super.onCreate();
    handler = new android.os.Handler();
    shared = getSharedPreferences("usershared", Context.MODE_PRIVATE);
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(30000);
    mLocationRequest.setFastestInterval(30000);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    mGoogleApiClient.connect();
}