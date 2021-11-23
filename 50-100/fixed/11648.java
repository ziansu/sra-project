@com.sogilis.ReactNativeBluetooth.ReactMethod
public void disconnect(final com.sogilis.ReactNativeBluetooth.ReadableMap deviceMap) {
    final java.lang.String deviceId = deviceMap.getString("id");
    com.sogilis.ReactNativeBluetooth.BluetoothAction disconnectAction = new com.sogilis.ReactNativeBluetooth.BluetoothAction(DEVICE_DISCONNECTED, deviceId, eventEmitter) {
        @java.lang.Override
        public void run() throws com.sogilis.ReactNativeBluetooth.domain.BluetoothException {
            com.sogilis.ReactNativeBluetooth.BluetoothGatt gatt = gattCollection.get(deviceId);
            gatt.disconnect();
            bluetoothActionsLoop.actionDone();
        }
    };
    bluetoothActionsLoop.addAction(disconnectAction);
}