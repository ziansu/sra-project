@java.lang.Override
public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    bound = true;
    localBinder = ((com.playposse.peertopeeroxygen.android.data.DataService.LocalBinder) (iBinder));
    if (shouldAutoInit) {
        localBinder.init();
        localBinder.registerDataReceivedCallback(dataReceivedCallback, checkCacheStale);
    }
    android.util.Log.i(com.playposse.peertopeeroxygen.android.data.DataServiceConnection.LOG_CAT, "The service is now connected.");
}