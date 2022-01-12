@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d(com.ph1ash.dexter.beeplepaper.BeeplePaperService.TAG, "Beeple Paper Service created");
    mClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Wearable.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
    mClient.connect();
}