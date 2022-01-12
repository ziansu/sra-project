public void sendMessage(java.lang.String inMessage) throws java.io.IOException {
    if ((inMessage.charAt(0)) == '/') {
        Client.clientSocket.close();
        java.lang.System.out.println("CLIENT - Disconnected from server.");
        java.lang.System.exit(0);
    }
    Client.serverOut.writeBytes((((("/chat" + (Client.username)) + ": ") + inMessage) + '\n'));
}