void writeCharacteristicQueue(byte[] bytes, java.util.UUID serviceUUID, java.util.UUID characteristicUUID) {
    if ((((mBluetoothGatt) == null) || (serviceUUID == null)) || (characteristicUUID == null)) {
        android.util.Log.d(com.qindachang.bluetoothle.BleManager.TAG, "the bluetooth gatt or serviceUUID or characteristicUUID is null. ");
        return ;
    }
    android.bluetooth.BluetoothGattService service = mBluetoothGatt.getService(serviceUUID);
    android.bluetooth.BluetoothGattCharacteristic characteristic = service.getCharacteristic(characteristicUUID);
    characteristic.setValue(bytes);
    mRequestQueue.addRequest(com.qindachang.bluetoothle.Request.newWriteRequest(characteristic));
}