@java.lang.Override
public void onConnectionStateChange(android.bluetooth.BluetoothGatt gatt, int status, int newState) {
    if (newState == (android.bluetooth.BluetoothProfile.STATE_CONNECTED)) {
        startServiceDiscovery();
        startMonitoringRssiValue();
        gattCustomCallbacks.onDeviceConnected();
    }else
        if (newState == (android.bluetooth.BluetoothProfile.STATE_DISCONNECTED)) {
            stopMonitoringRssiValue();
            gattCustomCallbacks.onDeviceDisconnected();
            bluetoothGatt.close();
        }
    
}