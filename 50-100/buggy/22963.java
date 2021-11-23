@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN_MR2)
@java.lang.Override
public void startLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback scanCallback) {
    if (isBluetoothLowEnergySupported()) {
        if (((bluetoothAdapter.getState()) == (android.bluetooth.BluetoothAdapter.STATE_ON)) && (permissionChecker.hasScanPermissionCheckAndroid6())) {
            android.util.Log.i("bluetooth adapter", java.lang.Integer.toString(bluetoothAdapter.getState()));
            bluetoothAdapter.startLeScan(crashCallBackWrapper);
            crashCallBackWrapper.setCallback(scanCallback);
            leScanRunning = true;
        }
    }
}