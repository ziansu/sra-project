public static boolean isLocAddr(java.lang.String host) {
    if (org.apache.ignite.internal.util.typedef.F.isEmpty(host))
        return true;
    
    final java.net.InetAddress x;
    try {
        x = java.net.InetAddress.getByName(host);
    } catch (java.io.IOException ioe) {
        return false;
    }
    return (x.isLinkLocalAddress()) || (x.isLoopbackAddress());
}