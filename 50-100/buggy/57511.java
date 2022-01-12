public boolean SendPing(java.net.InetAddress dest) {
    if (((socket) != null) && (dest != null)) {
        synchronized(socket) {
            java.net.DatagramPacket p = new java.net.DatagramPacket(tilitoli.DiscoveryModule.INTERNATIONAL_PING.getBytes(), tilitoli.DiscoveryModule.INTERNATIONAL_PING.getBytes().length, dest, tilitoli.DiscoveryModule.UDP_PORT);
            try {
                socket.send(p);
            } catch (java.lang.Exception e) {
                java.lang.System.out.println("DiscoveryModule.SnedPing: Unable to send trough socket!");
                return false;
            }
            return true;
        }
    }
    return false;
}