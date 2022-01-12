private void stopScan() {
    if ((mBinder) != null) {
        mBinder.setScanningState(false);
    }
    if (mIsScanning) {
        android.util.Log.v(Utils.TAG, "Stopping scan");
        final no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat scanner = no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat.getScanner();
        scanner.stopScan(mScanCallback);
        mProgressHandler.removeCallbacks(mBleScannerTimeoutRunnable);
        mIsScanning = false;
    }
}