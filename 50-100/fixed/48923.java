public java.lang.String dialogue() {
    java.net.DatagramPacket receiveMessage = new java.net.DatagramPacket(recvBuffer, recvBuffer.length);
    try {
        socket.receive(receiveMessage);
        message = new java.lang.String(recvBuffer, 0, receiveMessage.getLength());
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("ERROR Receiving! " + (e.getMessage())));
    }
    return message;
}