@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d(TAG, "Starting service...");
    registerReceiver(serviceReceiver, serviceReceiver.getIntentFilter());
    onServiceBorn();
    android.util.Log.i(TAG, "Service started");
    broadcastMessage(net.renoseven.framework.nias.NIAService.SERVICE_STATE_BORN);
}