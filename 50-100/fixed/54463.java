@java.lang.Override
public synchronized java.util.List<java.net.InetAddress> lookup(java.lang.String hostname) throws java.net.UnknownHostException {
    try {
        return java.util.Arrays.asList(resolveInternal(hostname, hostname, 0, true));
    } catch (java.io.IOException e) {
        if (e instanceof java.net.UnknownHostException)
            throw ((java.net.UnknownHostException) (e));
        
        throw new java.net.UnknownHostException(("Unable to resolve address " + (e.getMessage())));
    }
}