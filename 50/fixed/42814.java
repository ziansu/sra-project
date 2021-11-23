private void stopScan() {
    if (mIsScanning) {
        android.util.Log.v(Utils.TAG, "Stopping scan");
        final no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat scanner = no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat.getScanner();
        scanner.stopScan(scanCallback);
        mScanHandler.removeCallbacks(mBleScannerTimeoutRunnable);
        mIsScanning = false;
    }
}