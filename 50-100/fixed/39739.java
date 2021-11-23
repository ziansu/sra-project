@android.support.annotation.CallSuper
@java.lang.Override
public void onCreate() {
    org.radarcns.android.device.DeviceService.logger.info("Creating DeviceService {}", this);
    super.onCreate();
    mBinder = createBinder();
    android.content.IntentFilter filter = new android.content.IntentFilter(android.bluetooth.BluetoothAdapter.ACTION_STATE_CHANGED);
    registerReceiver(mBluetoothReceiver, filter);
    diskSpaceChecker = null;
    synchronized(this) {
        numberOfActivitiesBound.set(0);
        isInForeground = false;
        deviceScanner = null;
    }
}