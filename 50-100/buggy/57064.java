private static void sendResponse(java.net.DatagramSocket s, java.net.DatagramPacket dgp) throws java.lang.Exception {
    byte[] buf;
    int peer = (dgp.getPort()) - 50000;
    java.lang.String message = ("A ping response message was received from Peer " + peer) + ".";
    buf = message.getBytes();
    java.net.DatagramPacket res = new java.net.DatagramPacket(buf, buf.length, dgp.getAddress(), dgp.getPort());
    s.send(res);
}