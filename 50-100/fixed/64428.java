@java.lang.Override
public boolean send(byte[] protocol) {
    com.grasea.grandroid.ble.BluetoothLeService bluetoothLeService = controller.getBluetoothLeService();
    android.bluetooth.BluetoothGattCharacteristic gattCharacteristic = getGattCharacteristic();
    bluetoothLeService.setCharacteristicNotification(controller, gattCharacteristic, true);
    gattCharacteristic.setValue(protocol);
    return bluetoothLeService.writeCharacteristic(controller, gattCharacteristic);
}