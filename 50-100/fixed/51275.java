public void sendData(java.lang.String data) {
    if ((bluetoothSocket) != null) {
        if (bluetoothSocket.isConnected()) {
            if ((connectedThread) != null) {
                connectedThread.write(data);
            }else {
            }
        }else {
        }
    }else {
    }
}