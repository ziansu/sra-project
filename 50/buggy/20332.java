private void connectToDevice(android.bluetooth.BluetoothDevice device) {
    mGatt = device.connectGatt(getApplicationContext(), false, gattCallback);
    stopScan();
}