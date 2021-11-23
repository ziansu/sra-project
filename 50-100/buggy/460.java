protected void close() {
    try {
        output.close();
        input.close();
        socket.close();
        run = false;
    } catch (java.io.IOException ioe) {
        org.pmw.tinylog.Logger.error("There was a issue trying to close the socket or I/O streams: {}", ioe);
    }
    org.pmw.tinylog.Logger.info("{} sucessfully disconnected from the server", username);
}