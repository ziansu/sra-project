public static java.util.List<java.lang.String> getAvailableServerIPs(int timeout, int port) {
    java.util.List<java.lang.String> availableServerIPs = new java.util.ArrayList<>();
    try {
        net.connectionutil.ServerDiscoveryUtil.sendProbePacket(net.connectionutil.ServerDiscoveryUtil.getBroadcastAddresses(), port);
        availableServerIPs = net.connectionutil.ServerDiscoveryUtil.waitForServerResponses(timeout);
    } catch (java.net.SocketException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println();
    return availableServerIPs;
}