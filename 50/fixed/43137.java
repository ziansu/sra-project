@java.lang.Override
public void onCharacteristicChanged(android.bluetooth.BluetoothGatt gatt, final android.bluetooth.BluetoothGattCharacteristic characteristic) {
    mBluetoothGattCallback.onReceivedNotification(characteristic.getValue());
}