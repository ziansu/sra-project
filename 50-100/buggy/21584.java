@java.lang.Override
public void onCharacteristicRead(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    super.onCharacteristicRead(gatt, characteristic, status);
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        mConnectedDevice.get(gatt.getDevice()).deleteService(characteristic);
        mDeviceOperationCallback.onDeviceCharacteristicRead(gatt.getDevice().getAddress(), characteristic);
    }
}