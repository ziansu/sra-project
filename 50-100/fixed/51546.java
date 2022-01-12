public void initBluetooth() {
    mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if ((mBluetoothAdapter) == null) {
        android.util.Log.d(BlueAsConfig.logTag_, "Bluetooth is not supported");
        return ;
    }
    if (!(mBluetoothAdapter.isEnabled())) {
        callback_.turnOnBluetooth(new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE));
        return ;
    }
    android.util.Log.d(BlueAsConfig.logTag_, "Bluetooth Adapter now obtained");
    bluetoothActive_ = mBluetoothAdapter.isEnabled();
    devices_ = new java.util.LinkedHashSet<>();
    listPairedDevices();
    getInquiredDevices();
}