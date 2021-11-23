public org.alljoyn.bus.ProxyBusObject connect() throws de.kaizencode.tchaikovsky.exception.ConnectionException {
    busAttachment.enableConcurrentCallbacks();
    joinSession(hostName);
    return getProxyBusObject();
}