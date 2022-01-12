@java.lang.Override
protected void startConnectAndKeepAlive(java.net.InetAddress addr) {
    dispose();
    int port = getPort(MilightBindingConstants.PORT_VER6);
    if (port == 0) {
        return ;
    }
    com.setAddress(addr);
    com.setPort(port);
    com.start();
    updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_PENDING, "Waiting for session");
    session = new org.openhab.binding.milight.internal.protocol.MilightV6SessionManager(com, bridgeid, scheduler, this);
}