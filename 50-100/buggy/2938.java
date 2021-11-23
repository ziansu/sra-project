public void sendCommand(livecoding.Command command) {
    java.lang.String hostName = "127.0.0.1";
    int port = 4444;
    try {
        java.net.Socket commSocket = new java.net.Socket(hostName, port);
        java.io.OutputStream os = commSocket.getOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(os);
        oos.writeObject(command);
    } catch (java.io.IOException e) {
        java.lang.System.err.println(("Couldn't get I/O for the connection to " + hostName));
        java.lang.System.exit(1);
    }
}