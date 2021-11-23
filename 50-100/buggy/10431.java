private void setupSettingsFilters() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        if ((mLEScanner) == null) {
            mLEScanner = mBluetoothAdapter.getBluetoothLeScanner();
            settings = new android.bluetooth.le.ScanSettings.Builder().setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY).build();
            filters = new java.util.ArrayList<>();
            filters.add(new android.bluetooth.le.ScanFilter.Builder().setServiceUuid(new android.os.ParcelUuid(BluetoothServices.Advertisement)).build());
        }
    }
}