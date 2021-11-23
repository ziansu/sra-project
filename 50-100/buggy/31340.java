@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    if (((intent != null) && ((intent.getAction()) != null)) && (intent.getAction().equals(com.example.android.sunshine.app.SunshineWatchService.UPDATE))) {
        android.util.Log.e("SunPhone", "-----On Intent-----");
        mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(Wearable.API).build();
        mGoogleApiClient.connect();
    }
}