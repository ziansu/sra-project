public void unregisterSession(com.smartdevicelink.SdlConnection.SdlSession registerListener) {
    boolean didRemove = listenerList.remove(registerListener);
    closeConnection(((listenerList.size()) == 0), registerListener.getSessionId());
    if ((didRemove && ((_transport) != null)) && ((_transport.getTransportType()) == (com.smartdevicelink.transport.enums.TransportType.MULTIPLEX))) {
        ((com.smartdevicelink.SdlConnection.MultiplexTransport) (_transport)).removeSession(registerListener.getSessionId());
    }
}