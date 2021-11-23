public static boolean isLocAddr(java.lang.String host) {
    if (org.apache.ignite.internal.util.typedef.F.isEmpty(host))
        return true;
    
    try {
        java.net.InetAddress x = java.net.InetAddress.getByName(host);
        assert x != null;
        return (x.isLinkLocalAddress()) || (x.isLoopbackAddress());
    } catch (java.io.IOException ioe) {
        return false;
    }
}