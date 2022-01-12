@java.lang.Override
public void onCharacteristicWrite(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    if ((mEventListener) != null) {
        java.util.UUID uuidServ = characteristic.getService().getUuid();
        java.util.UUID uuidChar = characteristic.getUuid();
        Log(((("W : " + (uuidChar.toString())) + " > ") + (com.kidsdynamic.swing.androidswingapp.BLEControl.bytesToHex(characteristic.getValue()))));
        mEventListener.onCharacteristicWrite(uuidServ, uuidChar);
    }
    mTaskQueue.pop(true);
}