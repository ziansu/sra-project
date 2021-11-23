public void close() {
    java.lang.System.out.println(("BluetoothLeService close" + (mBluetoothGatt)));
    if ((mBluetoothGatt) == null) {
        return ;
    }
    mBluetoothGatt.close();
    mBluetoothGatt = null;
}