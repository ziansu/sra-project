void setLastStatus(android.bluetooth.BluetoothGatt gatt, int status) {
    timber.log.Timber.d("Changing status from %d to %d", lastStatus, status);
    if (((((lastStatus) != (android.bluetooth.BluetoothGatt.STATE_DISCONNECTED)) && ((lastStatus) != (android.bluetooth.BluetoothGatt.STATE_DISCONNECTING))) && (status == (android.bluetooth.BluetoothGatt.STATE_DISCONNECTED))) || (status == (android.bluetooth.BluetoothGatt.STATE_DISCONNECTING))) {
        timber.log.Timber.d("Disconnecting due to status %d", status);
        gatt.disconnect();
    }
    lastStatus = status;
}