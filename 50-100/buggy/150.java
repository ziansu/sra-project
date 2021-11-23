@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN_MR2)
@java.lang.Override
public void stopLeScan() {
    if (isBluetoothLowEnergySupported()) {
        try {
            bluetoothAdapter.stopLeScan(crashCallBackWrapper);
        } catch (java.lang.NullPointerException sentBySysteminternally) {
            Logger.log.logError("System bug throwing a NullPointerException internally.", sentBySysteminternally);
        } finally {
            leScanRunning = false;
            crashCallBackWrapper.setCallback(null);
        }
    }
}