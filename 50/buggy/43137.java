@java.lang.Override
public void onCharacteristicChanged(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic) {
    super.onCharacteristicChanged(gatt, characteristic);
    mBluetoothGattCallback.onReceivedNotification(characteristic.getValue());
}