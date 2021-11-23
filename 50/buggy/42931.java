@java.lang.Override
protected void onPause() {
    com.afunx.ble.blelitelib.scanner.BleScanner.stopLeScan(mLeScanCallback);
    super.onPause();
}