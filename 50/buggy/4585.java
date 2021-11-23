public synchronized void disconnect() throws java.io.IOException {
    if ((getConnectionState()) == (no.ntnu.osnap.com.BluetoothConnection.ConnectionState.STATE_CONNECTED)) {
        input.close();
        output.close();
        socket.close();
    }
    setConnectionState(no.ntnu.osnap.com.BluetoothConnection.ConnectionState.STATE_DISCONNECTED);
}