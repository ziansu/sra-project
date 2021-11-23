@java.lang.Override
public void onCreate() {
    super.onCreate();
    registerReceiver(this.mBatInfoReceiver, new android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED));
    android.util.Log.e(co.rapiddelivery.services.LocationService.TAG, "loc onCreate");
    if ((isGooglePlayServicesAvailable()) && ((mGoogleApiClient) == null)) {
        createLocationRequest();
        mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    }
    if ((mGoogleApiClient) != null) {
        mGoogleApiClient.connect();
    }
}