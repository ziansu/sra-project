@com.google.appinventor.components.annotations.SimpleFunction
public void StopScanning() {
    mBluetoothAdapter.stopLeScan(mLeScanCallback);
    uiThread.removeCallbacks(runScan);
}