@android.support.annotation.CallSuper
@java.lang.Override
public void onCreate() {
    org.radarcns.android.device.DeviceService.logger.info("Creating DeviceService {}", this);
    super.onCreate();
    mBinder = createBinder();
    android.content.IntentFilter filter = new android.content.IntentFilter(android.bluetooth.BluetoothAdapter.ACTION_STATE_CHANGED);
    registerReceiver(mBluetoothReceiver, filter);
    diskSpaceChecker = new android.content.ServiceConnection() {
        @java.lang.Override
        public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
        }

        @java.lang.Override
        public void onServiceDisconnected(android.content.ComponentName name) {
        }
    };
    synchronized(this) {
        numberOfActivitiesBound.set(0);
        isInForeground = false;
        deviceScanner = null;
    }
}