@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.O)
void stopAndroidOBackgroundScan() {
    try {
        final android.bluetooth.BluetoothManager bluetoothManager = ((android.bluetooth.BluetoothManager) (mContext.getApplicationContext().getSystemService(Context.BLUETOOTH_SERVICE)));
        android.bluetooth.BluetoothAdapter bluetoothAdapter = bluetoothManager.getAdapter();
        if (bluetoothAdapter == null) {
            org.altbeacon.beacon.logging.LogManager.w(org.altbeacon.beacon.service.ScanHelper.TAG, "Failed to construct a BluetoothAdapter");
        }else {
            bluetoothAdapter.getBluetoothLeScanner().stopScan(getScanCallbackIntent());
        }
    } catch (java.lang.SecurityException e) {
        org.altbeacon.beacon.logging.LogManager.e(org.altbeacon.beacon.service.ScanHelper.TAG, "SecurityException stopping Android O background scanner");
    }
}