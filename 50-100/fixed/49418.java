public static boolean isValidIP(java.lang.String ip) {
    if (ip == null) {
        return false;
    }
    if (ip.isEmpty()) {
        return false;
    }
    return (org.apache.http.conn.util.InetAddressUtils.isIPv4Address(ip)) || (org.apache.http.conn.util.InetAddressUtils.isIPv6Address(ip));
}