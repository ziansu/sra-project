public void requestConnection(java.lang.String handshake, java.lang.String host, int portNumber) {
    if ((!(connected)) && ((this.clientSocket) instanceof Client.ClientSocket)) {
        connected = ((Client.ClientSocket) (this.clientSocket)).connect(host, portNumber, handshake);
        if (connected)
            clientSocket.start();
        
    }
}