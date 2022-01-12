@java.lang.Override
public void initializeSession(org.apache.mina.core.session.IoSession wsSession, org.apache.mina.core.future.IoFuture future) {
    wsSession.setAttribute(HttpAcceptor.SERVICE_REGISTRATION_KEY, session.getAttribute(HttpAcceptor.SERVICE_REGISTRATION_KEY));
    wsSession.setAttribute(org.kaazing.gateway.transport.wsr.WsrAcceptor.HTTP_REQUEST_URI_KEY, session.getRequestURL());
    ((org.kaazing.gateway.transport.ws.AbstractWsBridgeSession) (wsSession)).setSubject(session.getSubject());
    wsSession.setAttribute(BridgeSession.NEXT_PROTOCOL_KEY, wsProtocol0);
    wsExtensions0.set(wsSession);
}