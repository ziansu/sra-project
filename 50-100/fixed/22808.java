@java.lang.Override
public void connect() {
    if ((castDevice) == null) {
        castDevice = ((com.google.android.gms.cast.CastDevice) (getServiceDescription().getDevice()));
    }
    if ((mApiClient) == null) {
        mApiClient = createApiClient();
    }
    if ((!(mApiClient.isConnecting())) && (!(mApiClient.isConnected()))) {
        mApiClient.connect();
    }
}