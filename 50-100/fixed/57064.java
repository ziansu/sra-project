private static void sendResponse(java.net.DatagramSocket s, java.net.DatagramPacket dgp, java.lang.String id, int peer) throws java.lang.Exception {
    byte[] buf;
    java.lang.String message = ("A ping response message was received from Peer " + peer) + ".";
    buf = message.getBytes();
    java.net.DatagramPacket res = new java.net.DatagramPacket(buf, buf.length, dgp.getAddress(), (50000 + (java.lang.Integer.parseInt(id))));
    s.send(res);
}