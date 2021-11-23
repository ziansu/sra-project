public void requestConnection(java.lang.String handshake, java.lang.String host, int portNumber) {
    if ((!(connected)) && ((clientSocket) == null)) {
        clientSocket = new client.ClientSocket(this);
        connected = ((client.ClientSocket) (this.clientSocket)).connect(host, portNumber, handshake);
        java.lang.System.out.println(connected);
        if (connected) {
            clientSocket.start();
        }else {
            clientSocket = null;
        }
    }
}