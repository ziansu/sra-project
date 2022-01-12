@java.lang.Override
public void onCharacteristicChanged(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic) {
    int flag = characteristic.getProperties();
    int format;
    if ((flag & 1) != 0) {
        format = android.bluetooth.BluetoothGattCharacteristic.FORMAT_UINT16;
    }else {
        format = android.bluetooth.BluetoothGattCharacteristic.FORMAT_UINT8;
    }
    int heartRate = characteristic.getIntValue(format, 1);
    if (heartRate != 0) {
        android.content.Intent i = new android.content.Intent(this, at.fhooe.mc.conconii.DataManager.class);
        i.putExtra("BLE_DATA", heartRate);
        sendBroadcast(i);
    }
}