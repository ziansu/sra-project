private void broadcastUpdate(final java.lang.String action, final android.bluetooth.BluetoothGattCharacteristic characteristic) {
    final android.content.Intent intent = new android.content.Intent(action);
    if (characteristic == null) {
        this.sendBroadcast(intent);
        return ;
    }
    android.util.Log.d(DEBUG_TAG, characteristic.getStringValue(0));
    if (com.example.mobile.smartcycledemo.bluetooth.BluetoothLeService.HEART_BEAT_UUID.equals(characteristic.getUuid())) {
        java.lang.String value = characteristic.getStringValue(0);
        intent.putExtra(com.example.mobile.smartcycledemo.bluetooth.BluetoothLeService.EXTRA_DATA, value);
        this.sendBroadcast(intent);
    }
}