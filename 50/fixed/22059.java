private void close() throws java.io.IOException {
    try {
        Server.close();
    } catch (java.net.SocketException e) {
    }
    Output.println("Server Closed.");
    running = false;
}