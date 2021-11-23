@java.lang.Override
public void onCharacteristicWrite(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    android.util.Log.w(org.three1one.simplegui.RBLService.TAG, "Written ");
    sendingContinuePacket(characteristic);
}