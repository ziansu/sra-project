public static client.Client getInstance() {
    if ((client.Client.instance) == null) {
        client.Client.instance = new client.Client();
        try {
            client.Client.instance.clientSocket = new java.net.Socket("localhost", 1337);
            client.Client.writer = new java.io.PrintWriter(client.Client.instance.clientSocket.getOutputStream());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return client.Client.instance;
}