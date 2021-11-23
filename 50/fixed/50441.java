@java.lang.Override
public void onCreate() {
    super.onCreate();
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Wearable.API).build();
    mGoogleApiClient.connect();
}