public void sendMessage(java.lang.String inMessage) throws java.io.IOException {
    if ((inMessage.charAt(0)) == '/') {
        Client.clientSocket.close();
        java.lang.System.exit(1);
    }
    Client.serverOut.writeBytes((("/chat" + inMessage) + '\n'));
}