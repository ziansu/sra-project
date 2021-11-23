@java.lang.Override
public void stopScan() {
    if ((isScanning()) && ((bluetoothAdapter) != null)) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
            bluetoothAdapter.getBluetoothLeScanner().stopScan(scanCallback);
        }else {
            bluetoothAdapter.stopLeScan(leScanCallback);
        }
        stopTimer();
    }
}