void receive() {
    SOUPmain.getClientlist().add(client);
    receivePacket = new java.net.DatagramPacket(new byte[PACKETSIZE], PACKETSIZE);
    try {
        socket.receive(receivePacket);
    } catch (java.lang.Exception e) {
        util.o((("Something went wrong by recieve the packet! ... " + e) + "\n"));
    }
}