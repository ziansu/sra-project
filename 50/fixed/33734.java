@java.lang.Override
public void onReadRemoteRssi(android.bluetooth.BluetoothGatt gatt, int rssi, int status) {
    broadcastUpdateRSSI(sentek.drillanddropconfig.services.BluetoothLeService.ACTION_RSSI_AVAILABLE, rssi);
}