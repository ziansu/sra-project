@java.lang.Override
public void connect() {
    if ((((connected) && ((mApiClient) != null)) && (mApiClient.isConnecting())) && (mApiClient.isConnected()))
        return ;
    
    if ((castDevice) == null) {
        this.castDevice = ((com.google.android.gms.cast.CastDevice) (getServiceDescription().getDevice()));
    }
    if ((mApiClient) == null) {
        mApiClient = createApiClient();
        mApiClient.connect();
    }
}