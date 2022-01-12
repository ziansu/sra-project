void handleDatagram(java.net.DatagramPacket datagram, long time) {
    this.lastReceivedPacket = time;
    byte packetID = datagram.getData()[0];
    switch (packetID) {
        case OPEN_CONNECTION_REQUEST_1 :
            this.handlePreConnectionRequest1(datagram);
            break;
        case OPEN_CONNECTION_REQUEST_2 :
            this.handlePreConnectionRequest2(datagram);
            break;
        default :
            this.handleConnectedDatagram(datagram);
            break;
    }
}