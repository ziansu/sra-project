private void stopScanOnRotation() {
    if ((!(isFinishing())) && (mIsScanning)) {
        if ((mBinder) != null) {
            mBinder.setScanningState(true);
        }
        android.util.Log.v(Utils.TAG, "Stopping scan on rotation");
        mProgressHandler.removeCallbacks(mBleScannerTimeoutRunnable);
        final no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat scanner = no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat.getScanner();
        scanner.stopScan(mScanCallback);
        mIsScanning = false;
    }
}