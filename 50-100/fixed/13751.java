public static boolean deny(com.sun.net.httpserver.HttpExchange t) {
    java.net.InetAddress address = t.getRemoteAddress().getAddress();
    return ((!(address.isLoopbackAddress())) && (!(net.pms.PMS.getConfiguration().getIpFiltering().allowed(address)))) || (!(net.pms.PMS.isReady()));
}