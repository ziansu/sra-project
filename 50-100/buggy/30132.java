@java.lang.Override
public void onCharacteristicRead(com.evothings.BluetoothGatt g, com.evothings.BluetoothGattCharacteristic c, int status) {
    if (status == (BluetoothGatt.GATT_SUCCESS)) {
        mCurrentOpContext.success(c.getValue());
    }else {
        mCurrentOpContext.error(status);
    }
    mCurrentOpContext = null;
    process();
}