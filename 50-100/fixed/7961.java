public void disconnect(boolean expected) {
    lookingForInput = false;
    listener.shutdown();
    clientAliveTimer.cancel();
    pixyel_backend.connection.socket.SocketServer.disconnect(this, socket.hashCode());
    try {
        socket.shutdownInput();
        socket.shutdownOutput();
        socket.close();
    } catch (java.lang.Exception e) {
        pixyel_backend.Log.logError(("Could not close the socket of the client " + (getName())), pixyel_backend.connection.socket.SocketClient.class);
    }
}