@java.lang.Override
public void run() {
    mScanning = false;
    mBluetoothAdapter.stopLeScan(mLeScanCallback);
    invalidateOptionsMenu();
}