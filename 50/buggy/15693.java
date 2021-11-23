public static void startSocket() {
    try {
        de.hartz.vpn.main.MediationConnector.clientSocket = new java.net.DatagramSocket();
    } catch (java.net.SocketException e) {
        e.printStackTrace();
    }
}