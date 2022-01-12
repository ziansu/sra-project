public void connect(java.lang.String address, int port) throws java.io.IOException, java.net.UnknownHostException {
    this.port = port;
    serverAddress = java.net.InetAddress.getByName(address);
    socket = new java.net.Socket(serverAddress, port);
    input = new java.util.Scanner(socket.getInputStream());
    output = new java.io.PrintWriter(socket.getOutputStream(), true);
    start();
}