private void addSession0(org.kaazing.mina.core.session.IoSessionEx wsebSession) {
    if (org.kaazing.gateway.transport.wseb.WsebInactivityTracker.ALREADY_TRACKED.get(wsebSession)) {
        return ;
    }
    org.kaazing.mina.core.session.IoSessionEx transportSession = ((org.kaazing.gateway.transport.wseb.WsebSession) (wsebSession)).getTransportSession();
    org.kaazing.gateway.transport.wseb.WsebInactivityTracker.ALREADY_TRACKED.set(wsebSession, true);
    idleTracker.addSession(transportSession);
    org.kaazing.gateway.transport.ws.bridge.filter.WsCheckAliveFilter.addIfFeatureEnabled(transportSession.getFilterChain(), org.kaazing.gateway.transport.wseb.WsebInactivityTracker.CHECK_ALIVE_FILTER, ((org.kaazing.gateway.transport.wseb.WsebSession) (wsebSession)).getLocalAddress().getOption(org.kaazing.gateway.resource.address.ws.WsResourceAddress.INACTIVITY_TIMEOUT), logger);
}