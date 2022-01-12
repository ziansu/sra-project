private java.lang.String getPortMapping(int port) {
    return (portOffset) == null ? ((ipAddress) + "::") + port : ((((ipAddress) + ":") + ((portOffset) + port)) + ":") + port;
}