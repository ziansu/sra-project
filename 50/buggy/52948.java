@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d(TAG, "Service started");
    this.mMobileDataUses = false;
    initialBluetoothMode();
    createBroadcastReceiver();
    checkPowerConnection();
    startBluetoothMode();
    setWakeLock();
}