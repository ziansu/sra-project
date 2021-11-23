private void sendAck() {
    android.util.Log.v(com.theshopatvsp.levelandroidsdk.ble.BleManager.TAG, "sending ACK for record");
    (ackSent)++;
    byte[] packet = new byte[]{ ((byte) (deviceId.getPacketIdOut())) , ((byte) (DeviceCommand.ACK.getCommand())) , ((byte) (deviceId.getPacketIdIn())) };
    deviceId.incPacketIdOut();
    addCommand(new com.theshopatvsp.levelandroidsdk.ble.model.LevelCommand(com.theshopatvsp.levelandroidsdk.ble.model.constants.ReadWriteEnum.WRITE, com.theshopatvsp.levelandroidsdk.ble.model.constants.CharacteristicEnum.UART_TX, packet));
}