public java.lang.String dialogue() {
    java.net.DatagramPacket receiveMessage = new java.net.DatagramPacket(recvBuffer, recvBuffer.length);
    try {
        socket.receive(receiveMessage);
        java.lang.System.out.println(receiveMessage.getAddress());
        message = new java.lang.String(recvBuffer, 0, receiveMessage.getLength());
        java.lang.System.out.println(message);
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("ERROR Receiving! " + (e.getMessage())));
    }
    return message;
}