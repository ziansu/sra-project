public void disconnect(boolean expected) {
    lookingForInput = false;
    if ((listener) != null) {
        listener.shutdown();
    }
    clientAliveTimer.cancel();
    pixyel_backend.connection.Connection.disconnect(socket.hashCode());
    try {
        socket.close();
    } catch (java.lang.Exception e) {
        pixyel_backend.Log.logError(("Could not close the socket of the client " + (getName())), pixyel_backend.connection.Client.class);
    }
}