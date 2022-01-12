public void readRSSI(com.facebook.react.bridge.Callback callback) {
    if (!(isConnected())) {
        callback.invoke("Device is not connected", null);
        return ;
    }
    if ((gatt) == null) {
        callback.invoke("BluetoothGatt is null", null);
        return ;
    }
    readRSSICallback = callback;
    if (!(gatt.readRemoteRssi())) {
        readCallback = null;
        callback.invoke("Read RSSI failed", null);
    }
}