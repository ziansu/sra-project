@java.lang.Override
public void onServicesDiscovered(com.sogilis.ReactNativeBluetooth.BluetoothGatt gatt, int status) {
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        emit(servicesDiscovered(gatt.getDevice(), gatt.getServices()));
    }else {
        emitGattError(com.sogilis.ReactNativeBluetooth.SERVICES_DISCOVERED, status, gatt);
    }
    bluetoothActionsLoop.actionDone();
}