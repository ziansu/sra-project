public org.alljoyn.bus.ProxyBusObject connect() throws de.kaizencode.tchaikovsky.exception.ConnectionException {
    joinSession(hostName);
    return getProxyBusObject();
}