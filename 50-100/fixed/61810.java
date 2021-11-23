protected void _readCharacteristic(com.Tony.Zakron.ble.BlePeripheral peripheral, com.Tony.Zakron.ConnectBlue.BluetoothGattCharacteristic characteristic, byte[] value) {
    if ((peripheral != (_peripheral)) || (peripheral == null))
        return ;
    
    com.Tony.Zakron.ConnectBlue.SerialPort.ReadData data = new com.Tony.Zakron.ConnectBlue.SerialPort.ReadData();
    data.port = this;
    data.bytes = value;
    com.Tony.Zakron.event.EventManager.sharedInstance().post(com.Tony.Zakron.ConnectBlue.SerialPort.kSerialPortReadDataNotification, data);
}