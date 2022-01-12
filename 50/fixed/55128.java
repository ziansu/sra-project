@java.lang.Override
public void run() {
    mScanning = false;
    mBluetoothAdapter.stopLeScan(leScanCallback);
    if ((bleDevices.size()) > 0) {
        showScannedDevices();
    }
    showProgress(mScanning);
    invalidateOptionsMenu();
}