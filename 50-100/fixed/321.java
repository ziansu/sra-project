@java.lang.Override
public void onCharacteristicRead(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        java.lang.System.out.println(("onCharacteristicRead  " + (characteristic.getUuid().toString())));
        broadcastUpdate(gatt, tw.edu.ntust.jojllman.wearableapplication.BLE.BluetoothLeService.ACTION_DATA_AVAILABLE, characteristic);
    }
}