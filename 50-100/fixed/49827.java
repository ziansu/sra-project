public boolean bufferMessage(networking.StringMessage sm) {
    if (!(socket.isConnected())) {
        end();
        return false;
    }
    try {
        output.writeObject(sm);
    } catch (java.io.IOException ioe) {
        org.pmw.tinylog.Logger.error("{} had an error when attempting to write to the output stream: {}", username, ioe);
    }
    return true;
}