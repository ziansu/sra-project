private void connect(java.lang.String address, int port) {
    try {
        socket = new java.net.Socket(address, port);
        output = new java.io.DataOutputStream(socket.getOutputStream());
        input = new java.io.DataInputStream(socket.getInputStream());
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception e) {
        }
        send(name);
    } catch (java.io.IOException ex) {
        java.lang.System.err.println("Client: Failed to connect to server.");
        java.lang.System.exit(0);
    }
}