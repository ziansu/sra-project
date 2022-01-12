public synchronized void disconnect() throws java.io.IOException {
    setConnectionState(no.ntnu.osnap.com.BluetoothConnection.ConnectionState.STATE_DISCONNECTED);
    if ((getConnectionState()) == (no.ntnu.osnap.com.BluetoothConnection.ConnectionState.STATE_CONNECTED)) {
        input.close();
        output.close();
        socket.close();
    }
}