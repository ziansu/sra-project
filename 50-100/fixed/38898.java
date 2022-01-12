@java.lang.Override
public void run() throws com.sogilis.ReactNativeBluetooth.domain.BluetoothException {
    com.sogilis.ReactNativeBluetooth.BluetoothGatt gatt = gattCollection.get(deviceId);
    com.sogilis.ReactNativeBluetooth.BluetoothGattCharacteristic characteristic = findCharacteristic(gatt, serviceId, characteristicId, BluetoothGattCharacteristic.PROPERTY_READ);
    if (!(gatt.readCharacteristic(characteristic))) {
        eventEmitter.emitError(com.sogilis.ReactNativeBluetooth.CHARACTERISTIC_READ, "Could not initiate characteristic read for unknown reason.", characteristicId);
        bluetoothActionsLoop.actionDone();
    }
}