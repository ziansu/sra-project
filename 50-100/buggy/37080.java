@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        broadcastUpdate(com.example.katri.ebandage.BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED);
        initializeVoltageService();
        android.util.Log.i(com.example.katri.ebandage.BluetoothLeService.TAG, ("onServicesDiscovered received: " + status));
    }else {
        android.util.Log.i(com.example.katri.ebandage.BluetoothLeService.TAG, ("onServicesDiscovered received: " + status));
        broadcastUpdate(com.example.katri.ebandage.BluetoothLeService.ACTION_GATT_SERVICES_NOT_DISCOVERED);
    }
}