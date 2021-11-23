@android.support.annotation.CallSuper
@java.lang.Override
public void onDestroy() {
    org.radarcns.android.device.DeviceService.logger.info("Destroying DeviceService {}", this);
    super.onDestroy();
    unregisterReceiver(mBluetoothReceiver);
    stopDeviceManager(unsetDeviceManager());
    unbindService(diskSpaceChecker);
    try {
        dataHandler.close();
    } catch (java.io.IOException e) {
    }
}