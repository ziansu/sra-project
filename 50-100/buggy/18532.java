@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    buildGoogleApiClient();
    spm = new trainedge.companera.SoundProfileManager(this);
    if (((mGoogleApiClient) != null) && (!(mGoogleApiClient.isConnected()))) {
        mGoogleApiClient.connect();
    }
    android.widget.Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
    return START_STICKY_COMPATIBILITY;
}