private void stopScan() {
    mScanCallbackContext = null;
    final com.evothings.BluetoothAdapter adapter = com.evothings.BluetoothAdapter.getDefaultAdapter();
    final com.evothings.BluetoothAdapter.LeScanCallback callback = this;
    adapter.stopLeScan(callback);
}