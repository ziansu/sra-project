public static int nextAvailablePort(int port) {
    com.google.common.base.Preconditions.checkArgument(((port >= (brooklyn.util.net.Networking.MIN_PORT_NUMBER)) && (port <= (brooklyn.util.net.Networking.MAX_PORT_NUMBER))), "requested port %s is outside the valid range of %s to %s", port, brooklyn.util.net.Networking.MIN_PORT_NUMBER, brooklyn.util.net.Networking.MAX_PORT_NUMBER);
    int originalPort = port;
    while ((!(brooklyn.util.net.Networking.isPortAvailable(port))) && (port <= (brooklyn.util.net.Networking.MAX_PORT_NUMBER)))
        port++;
    
    if (port > (brooklyn.util.net.Networking.MAX_PORT_NUMBER))
        throw new java.lang.RuntimeException(("unable to find a free port at or above " + originalPort));
    
    return port;
}