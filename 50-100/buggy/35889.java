@java.lang.Override
public void onCreate() {
    android.util.Log.d(TAG, "Starting service...");
    super.onCreate();
    registerReceiver(serviceReceiver, serviceReceiver.getIntentFilter());
    onServiceBorn();
    android.util.Log.i(TAG, "Service started");
    broadcastMessage(net.renoseven.framework.nias.NIAService.SERVICE_STATE_BORN);
}