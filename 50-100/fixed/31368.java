@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
    if ((connectState) != (com.mapzen.android.lost.internal.FusedLocationProviderApiImpl.ConnectState.IDLE)) {
        if (!(connectionCallbacks.isEmpty())) {
            for (com.mapzen.android.lost.api.LostApiClient.ConnectionCallbacks callbacks : connectionCallbacks) {
                callbacks.onConnectionSuspended();
            }
        }
        connectState = com.mapzen.android.lost.internal.FusedLocationProviderApiImpl.ConnectState.IDLE;
    }
    android.util.Log.d(com.mapzen.android.lost.internal.FusedLocationProviderApiImpl.TAG, "[onServiceDisconnected]");
}