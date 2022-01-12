@java.lang.Override
public void run() {
    if (((mConnectionState) == (com.wm.blecore.BluetoothLeService.STATE_CONNECTING)) || ((mConnectionState) == (com.wm.blecore.BluetoothLeService.STATE_CONNECTED))) {
        disconnect();
        broadcastUpdate(com.wm.blecore.BluetoothLeService.ACTION_GATT_DISCONNECTED);
    }
}