@java.lang.Override
public void onCharacteristicChanged(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic) {
    if (com.lewetechnologies.app.services.BluetoothSerialService.SERIAL_CHARACTERISTC_RX.equals(characteristic.getUuid().toString())) {
        final byte[] data = characteristic.getValue();
        if ((data != null) && ((data.length) > 0)) {
            buffer += new java.lang.String(data);
        }
        com.lewetechnologies.app.logger.Logger.e(com.lewetechnologies.app.services.BluetoothSerialService.TAG, ("Buffer: " + (buffer)));
    }
}