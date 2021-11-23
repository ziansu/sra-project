public void immediateAlert() {
    if ((((immediateAlertService) == null) || ((immediateAlertService.getCharacteristics()) == null)) || ((immediateAlertService.getCharacteristics().size()) == 0)) {
        somethingGoesWrong();
    }
    final android.bluetooth.BluetoothGattCharacteristic characteristic = immediateAlertService.getCharacteristics().get(0);
    characteristic.setValue(net.sylvek.itracing2.BluetoothLEService.HIGH_ALERT, BluetoothGattCharacteristic.FORMAT_UINT8, 0);
    this.bluetoothGatt.writeCharacteristic(characteristic);
}