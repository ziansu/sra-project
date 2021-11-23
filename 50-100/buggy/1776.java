public void openConnection() throws java.io.IOException {
    java.lang.System.out.println(("Trying to open socket on port " + (port)));
    java.net.ServerSocket serverSocket = new java.net.ServerSocket(port);
    new java.lang.Thread(this.announceGame).start();
    java.net.Socket acceptedConnection = serverSocket.accept();
    notConnected = false;
    this.clientSocket = acceptedConnection;
    inFromClient = new java.io.BufferedReader(new java.io.InputStreamReader(this.clientSocket.getInputStream()));
    outToClient = new java.io.DataOutputStream(this.clientSocket.getOutputStream());
    isConnected = true;
}