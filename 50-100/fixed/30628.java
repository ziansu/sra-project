public void getSensorLocation() {
    if (com.example.android.bluetoothlegatt.pack.BluetoothRscp.VDBG)
        android.util.Log.d(com.example.android.bluetoothlegatt.pack.BluetoothRscp.TAG, "getSensorLocation()");
    
    android.bluetooth.BluetoothGattService rscService = mBluetoothGatt.getService(com.example.android.bluetoothlegatt.pack.BluetoothRscp.RSC_SERVICE);
    if (rscService == null) {
        return ;
    }
    android.bluetooth.BluetoothGattCharacteristic characteristic = rscService.getCharacteristic(com.example.android.bluetoothlegatt.pack.BluetoothRscp.RSC_SENSOR_LOCATION_CHARAC);
    readCharacteristic(characteristic);
}