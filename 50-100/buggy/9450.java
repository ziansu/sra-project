public void start(int port) {
    this.port = port;
    try {
        serverSocket = new java.net.DatagramSocket(port);
        byte[] receiveData = new byte[1024];
        java.lang.System.out.println(("Starting on port " + port));
        on = true;
        run(receiveData);
    } catch (java.net.SocketException e) {
        e.printStackTrace();
    }
}