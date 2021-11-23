private void stopScan(final com.evothings.CordovaArgs args, final com.evothings.CallbackContext callbackContext) {
    mScanCallbackContext = null;
    final com.evothings.BluetoothAdapter adapter = com.evothings.BluetoothAdapter.getDefaultAdapter();
    final com.evothings.BluetoothAdapter.LeScanCallback callback = this;
    adapter.stopLeScan(callback);
}