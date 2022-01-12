@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    java.lang.System.out.println(("onServicesDiscovered " + status));
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        broadcastUpdate(tw.edu.ntust.jojllman.wearableapplication.BLE.BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED);
    }else {
        android.util.Log.w(tw.edu.ntust.jojllman.wearableapplication.BLE.BluetoothLeService.TAG, ("onServicesDiscovered received: " + status));
    }
}