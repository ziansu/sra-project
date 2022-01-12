private void setCharacteristicNotification(net.sylvek.itracing2.BluetoothGatt bluetoothgatt, net.sylvek.itracing2.BluetoothGattCharacteristic bluetoothgattcharacteristic, boolean flag) {
    bluetoothgatt.setCharacteristicNotification(bluetoothgattcharacteristic, flag);
    if (net.sylvek.itracing2.BluetoothLEService.FIND_ME_CHARACTERISTIC.equals(bluetoothgattcharacteristic.getUuid())) {
        net.sylvek.itracing2.BluetoothGattDescriptor descriptor = bluetoothgattcharacteristic.getDescriptor(net.sylvek.itracing2.BluetoothLEService.CLIENT_CHARACTERISTIC_CONFIG);
        if (descriptor != null) {
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            bluetoothgatt.writeDescriptor(descriptor);
        }
    }
}