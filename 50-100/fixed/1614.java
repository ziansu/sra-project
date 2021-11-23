public void retrieveServices(com.facebook.react.bridge.Callback callback) {
    if (!(isConnected())) {
        callback.invoke("Device is not connected", null);
        return ;
    }
    if ((gatt) == null) {
        callback.invoke("BluetoothGatt is null", null);
        return ;
    }
    this.retrieveServicesCallback = callback;
    gatt.discoverServices();
}