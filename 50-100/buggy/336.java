@java.lang.Override
public void onCharacteristicRead(android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    if (status != (android.bluetooth.BluetoothGatt.GATT_FAILURE)) {
        mError = new com.jameslandrum.bluetoothsmart.actions.ReadCharacteristic.CharacteristicReadError();
    }else {
        for (com.jameslandrum.bluetoothsmart.actions.ReadCharacteristic.OnReadCharacteristic r : mListeners) {
            r.onCharacteristicRead(mCharacteristic);
        }
    }
    synchronized(mHolder) {
        mHolder.notify();
    }
}