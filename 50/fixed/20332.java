private void connectToDevice(android.bluetooth.BluetoothDevice device) {
    if ((mGatt) == null) {
        mGatt = device.connectGatt(getApplicationContext(), false, gattCallback);
        stopScan();
    }
}