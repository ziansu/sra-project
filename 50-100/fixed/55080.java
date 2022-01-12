public void sendThruUDP(byte[] soundpacket) {
    try {
        java.net.DatagramSocket sock = new java.net.DatagramSocket();
        for (java.lang.String host : ipAddresses()) {
            java.lang.System.out.println(host);
            sock.send(new java.net.DatagramPacket(soundpacket, soundpacket.length, java.net.InetAddress.getByName(host), this.UDP_MUSIC_PORT));
        }
        sock.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println(" Unable to send soundpacket using UDP ");
    }
}