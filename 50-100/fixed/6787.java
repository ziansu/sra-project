private void stopBluetoothReader() {
    if ((mConnectedThread) != null)
        mConnectedThread.write("0");
    
    if (((btSocket) != null) && (btSocket.isConnected())) {
        try {
            btSocket.close();
        } catch (java.io.IOException e) {
        }
    }
}