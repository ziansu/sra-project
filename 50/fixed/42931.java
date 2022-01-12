@java.lang.Override
protected void onPause() {
    super.onPause();
    com.afunx.ble.blelitelib.scanner.BleScanner.stopLeScan(mLeScanCallback);
}