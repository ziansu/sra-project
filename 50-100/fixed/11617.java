private void startScanning() {
    android.bluetooth.le.ScanSettings settings = new android.bluetooth.le.ScanSettings.Builder().setScanMode(ScanSettings.SCAN_MODE_LOW_POWER).build();
    mBluetoothLeScanner.startScan(new java.util.ArrayList<android.bluetooth.le.ScanFilter>(), settings, mScanCallback);
    if (com.foodaholic.foodaholic.service.EddystoneScannerService.DEBUG_SCAN)
        android.util.Log.d(com.foodaholic.foodaholic.service.EddystoneScannerService.TAG, "Scanning started…");
    
}