public java.lang.String receiveMessages() {
    java.lang.String receivedMsg = null;
    try {
        clientSocket.receive(receivePacket);
        receivedMsg = new java.lang.String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
    } catch (java.io.IOException e) {
        java.lang.System.out.println(((clientName) + ": Error trying to receive message from server"));
    }
    return receivedMsg;
}