public void requestConnection(java.lang.String handshake, java.lang.String host, int portNumber) {
    if ((!(connected)) && ((this.clientSocket) instanceof client.ClientSocket)) {
        connected = ((client.ClientSocket) (this.clientSocket)).connect(host, portNumber, handshake);
        if (connected)
            clientSocket.start();
        
    }
}