public static boolean isValidIP(java.lang.String ip) {
    if (ip == null) {
        return false;
    }
    if (ip.isEmpty()) {
        return false;
    }
    try {
        java.net.InetAddress ia = java.net.InetAddress.getByName(ip);
        return (org.apache.http.conn.util.InetAddressUtils.isIPv4Address(ia.getHostAddress())) || (org.apache.http.conn.util.InetAddressUtils.isIPv6Address(ia.getHostAddress()));
    } catch (java.net.UnknownHostException e) {
        return false;
    }
}