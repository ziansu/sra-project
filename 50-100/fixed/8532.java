public void Connect(android.bluetooth.BluetoothDevice device) {
    android.bluetooth.BluetoothSocket tmp = null;
    try {
        tmp = device.createRfcommSocketToServiceRecord(java.util.UUID.fromString(mUUID));
        com.example.ibrahim.myapplication.BluetoothChat.ConnectThread CT = new com.example.ibrahim.myapplication.BluetoothChat.ConnectThread(tmp);
        CT.start();
    } catch (java.io.IOException e) {
    }
}