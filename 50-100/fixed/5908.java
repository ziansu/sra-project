@java.lang.Override
public void onDescriptorRead(com.evothings.BluetoothGatt g, com.evothings.BluetoothGattDescriptor d, int status) {
    if ((mCurrentOpContext) == null)
        return ;
    
    if (status == (BluetoothGatt.GATT_SUCCESS)) {
        mCurrentOpContext.success(d.getValue());
    }else {
        mCurrentOpContext.error(status);
    }
    mCurrentOpContext = null;
    process();
}