@java.lang.Override
public boolean send(byte[] protocol) {
    try {
        java.lang.Thread.sleep(300);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    com.grasea.grandroid.ble.BluetoothLeService bluetoothLeService = controller.getBluetoothLeService();
    android.bluetooth.BluetoothGattCharacteristic gattCharacteristic = getGattCharacteristic();
    bluetoothLeService.setCharacteristicNotification(controller, gattCharacteristic, true);
    gattCharacteristic.setValue(protocol);
    return bluetoothLeService.writeCharacteristic(controller, gattCharacteristic);
}