@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.util.Log.d(com.example.android.sunshine.app.SendMessaageService.TAG, "in sendMessage Service");
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApiIfAvailable(Wearable.API).build();
    mGoogleApiClient.connect();
}