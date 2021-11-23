@java.lang.Override
public void run() {
    if (((mConnectionState) == (com.wm.blecore.BluetoothLeService.STATE_CONNECTING)) || ((mConnectionState) == (com.wm.blecore.BluetoothLeService.STATE_CONNECTED))) {
        disconnect();
        java.lang.System.out.println("handler post delayed executed");
        broadcastUpdate(com.wm.blecore.BluetoothLeService.ACTION_GATT_DISCONNECTED);
    }
}