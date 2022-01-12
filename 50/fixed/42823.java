public void close() {
    if ((bluetoothGatt) == null) {
        return ;
    }
    bluetoothGatt.close();
    bluetoothGatt = null;
    android.util.Log.d(DEBUG_TAG, "close() called");
}