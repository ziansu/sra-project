static boolean checkBluetooth(android.bluetooth.BluetoothAdapter bluetoothAdapter) {
    return (bluetoothAdapter == null) || (!(bluetoothAdapter.isEnabled()));
}