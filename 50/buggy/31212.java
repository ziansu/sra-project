public void close() {
    java.lang.System.out.println("BluetoothLeService close");
    if ((mBluetoothGatt) == null) {
        return ;
    }
    mBluetoothGatt.close();
    mBluetoothGatt = null;
}