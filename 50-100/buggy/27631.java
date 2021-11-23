private void stopScan() {
    if (mIsScanning) {
        android.util.Log.v(Utils.TAG, "Stopping scan");
        mScanHandler.removeCallbacks(mBleScannerTimeoutRunnable);
        final no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat scanner = no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat.getScanner();
        scanner.stopScan(scanCallback);
        mIsScanning = false;
    }else
        if (!(isFinishing())) {
            android.util.Log.v(Utils.TAG, "Stopping scan on rotation");
            mScanHandler.removeCallbacks(mBleScannerTimeoutRunnable);
            final no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat scanner = no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat.getScanner();
            scanner.stopScan(scanCallback);
            mIsScanning = false;
        }
    
}