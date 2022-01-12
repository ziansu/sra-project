public synchronized void send(java.lang.String message) {
    try {
        java.net.Socket client = new java.net.Socket(server, port);
        java.lang.System.out.println(("Just connected to " + (client.getRemoteSocketAddress())));
        java.io.OutputStream outToServer = client.getOutputStream();
        java.io.DataOutputStream out = new java.io.DataOutputStream(outToServer);
        out.writeUTF(message);
        client.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}