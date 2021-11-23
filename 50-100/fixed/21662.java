public void run() {
    myBluetooth.cancelDiscovery();
    try {
        com.example.bmihaylov.rcremotecontrol.BluetoothDevicesFragment.bluetoothSocket.connect();
        getDialog().dismiss();
        com.example.bmihaylov.rcremotecontrol.BluetoothDevicesFragment.bluetoothSocket.getOutputStream().write("O".getBytes());
    } catch (java.io.IOException connectException) {
        connectException.printStackTrace();
        try {
            com.example.bmihaylov.rcremotecontrol.BluetoothDevicesFragment.bluetoothSocket.close();
        } catch (java.io.IOException closeException) {
            closeException.printStackTrace();
        }
    }
}