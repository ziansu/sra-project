private void send(int id, byte[] contents, java.lang.String ip) {
    try {
        byte[] array = edu.mst.marsrover.redmobile.rovecomm.RoveProtocol.encodePacket(id, contents, 0, false);
        datagramSocket.send(new java.net.DatagramPacket(array, array.length, java.net.InetAddress.getByName(ip), edu.mst.marsrover.redmobile.rovecomm.RoveComm.PORT));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}