private void stopBluetoothReader() {
    if ((mConnectedThread) != null)
        mConnectedThread.write("2");
    
    if (((btSocket) != null) && (btSocket.isConnected())) {
        try {
            btSocket.close();
        } catch (java.io.IOException e) {
        }
    }
}