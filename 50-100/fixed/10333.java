public void onConnectionStateChange(android.bluetooth.BluetoothGatt gatt, int status, int newState) {
    java.lang.String intentAction;
    java.lang.System.out.println(status);
    if (newState == (android.bluetooth.BluetoothProfile.STATE_CONNECTED)) {
        intentAction = com.wm.blecore.BluetoothLeService.ACTION_GATT_CONNECTED;
        mConnectionState = com.wm.blecore.BluetoothLeService.STATE_CONNECTED;
        broadcastUpdate(intentAction);
        mBluetoothGatt.discoverServices();
    }else
        if (newState == (android.bluetooth.BluetoothProfile.STATE_DISCONNECTED)) {
            intentAction = com.wm.blecore.BluetoothLeService.ACTION_GATT_DISCONNECTED;
            mConnectionState = com.wm.blecore.BluetoothLeService.STATE_DISCONNECTED;
            broadcastUpdate(intentAction);
        }
    
}