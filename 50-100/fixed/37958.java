protected void terminateConnection(final android.bluetooth.BluetoothGatt gatt, final int error) {
    if ((mConnectionState) != (no.nordicsemi.android.dfu.DfuBaseService.STATE_DISCONNECTED)) {
        disconnect(gatt);
    }
    refreshDeviceCache(gatt, false);
    close(gatt);
    waitFor(600);
    if (error != 0)
        report(error);
    
}