private void initialize() {
    if ((mBluetoothAdapter) == null) {
        final android.bluetooth.BluetoothManager bluetoothManager = ((android.bluetooth.BluetoothManager) (com.supsi.alessandro.pollutionproblemclient.PollutionApplication.getAppContext().getSystemService(Context.BLUETOOTH_SERVICE)));
        mBluetoothAdapter = bluetoothManager.getAdapter();
    }else {
        android.util.Log.w(com.supsi.alessandro.pollutionproblemclient.ble.BleManager.TAG, "initialize() ---> Bluetooth adapter is already initialized");
    }
}