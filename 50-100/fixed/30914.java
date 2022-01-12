@com.sogilis.ReactNativeBluetooth.ReactMethod
public void discoverServices(final com.sogilis.ReactNativeBluetooth.ReadableMap deviceMap, final com.sogilis.ReactNativeBluetooth.ReadableArray serviceIds) {
    final java.lang.String deviceId = deviceMap.getString("id");
    com.sogilis.ReactNativeBluetooth.BluetoothAction discoverServicesAction = new com.sogilis.ReactNativeBluetooth.BluetoothAction(SERVICE_DISCOVERY_STARTED, deviceId, eventEmitter) {
        @java.lang.Override
        public void run() throws com.sogilis.ReactNativeBluetooth.domain.BluetoothException {
            com.sogilis.ReactNativeBluetooth.BluetoothGatt gatt = gattCollection.get(deviceId);
            gatt.discoverServices();
            emit(serviceDiscoveryStarted(gatt.getDevice()));
        }
    };
    bluetoothActionsLoop.addAction(discoverServicesAction);
}