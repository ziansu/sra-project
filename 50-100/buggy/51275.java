public void sendData(java.lang.String data) {
    if ((bluetoothSocket) != null) {
        if (bluetoothSocket.isConnected()) {
            if ((connectedThread) != null) {
                connectedThread.write(data);
            }else {
                android.util.Log.d("BluetoothUtility", "Connected Thread is null");
            }
        }else {
            android.util.Log.d("BluetoothUtility", "Socket is not connected.");
        }
    }else {
        android.util.Log.d("BluetoothUtility", "Socket is null");
    }
}