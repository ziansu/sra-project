private void connectToDevice(android.bluetooth.BluetoothDevice device) {
    android.util.Log.i(com.eveningoutpost.dexdrip.Services.G5CollectionService.TAG, "Request Connect");
    if ((mGatt) == null) {
        stopScan();
        mGatt = device.connectGatt(getApplicationContext(), false, gattCallback);
    }
}