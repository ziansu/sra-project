private java.util.ArrayList<java.lang.String> runSocket(int packetsMax) throws java.io.IOException {
    java.util.ArrayList<java.lang.String> toReturn = new java.util.ArrayList<java.lang.String>();
    while (packetsMax != 0) {
        byte[] rcvdInfo = new byte[10];
        java.net.DatagramPacket packet = new java.net.DatagramPacket(rcvdInfo, rcvdInfo.length);
        socket.receive(packet);
        toReturn.add(packet.getData().toString());
        packetsMax--;
    } 
    return toReturn;
}