private void initServer() {
    android.bluetooth.BluetoothGattService service = new android.bluetooth.BluetoothGattService(interdroid.swan.crossdevice.ble.BLEManager.SWAN_SERVICE_UUID, android.bluetooth.BluetoothGattService.SERVICE_TYPE_PRIMARY);
    android.bluetooth.BluetoothGattCharacteristic charUnregister = new android.bluetooth.BluetoothGattCharacteristic(interdroid.swan.crossdevice.ble.BLEManager.SWAN_CHAR_UNREGISTER_UUID, android.bluetooth.BluetoothGattCharacteristic.PROPERTY_WRITE, android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE);
    service.addCharacteristic(charUnregister);
    bleServer = btManager.openGattServer(context, bleServerCallback);
    bleServer.addService(service);
}