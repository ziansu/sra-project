@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    buildGoogleApiClient();
    spm = new trainedge.companera.SoundProfileManager(this);
    if (((mGoogleApiClient) != null) && (!(mGoogleApiClient.isConnected()))) {
        mGoogleApiClient.connect();
    }
    return START_STICKY_COMPATIBILITY;
}