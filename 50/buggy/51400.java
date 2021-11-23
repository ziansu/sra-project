public void connect(com.ericsson.addroneapplication.model.ConnectionInfo connectionInfo) {
    android.util.Log.e(com.ericsson.addroneapplication.communication.TcpSocket.DEBUG_TAG, "connect");
    state = com.ericsson.addroneapplication.communication.TcpSocket.State.CONNECTING;
    connection = new com.ericsson.addroneapplication.communication.TcpSocket.SocketConnection();
    android.util.Log.e(com.ericsson.addroneapplication.communication.TcpSocket.DEBUG_TAG, "connect22");
    connection.execute(connectionInfo);
}