private java.lang.String getPortMapping(int port) {
    return (portOffset) == 0 ? ((ipAddress) + "::") + port : ((((ipAddress) + ":") + ((portOffset) + port)) + ":") + port;
}