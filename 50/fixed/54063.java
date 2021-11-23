@java.lang.Override
public void disconnect(android.bluetooth.BluetoothDevice device) {
    if ((mBluetoothGatt) != null) {
        mBluetoothGatt.disconnect();
    }
}