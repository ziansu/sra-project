@java.lang.Override
public java.lang.Object onReceive(org.voovan.network.IoSession session, java.lang.Object obj) {
    org.voovan.tools.log.Logger.simple((((session.remoteAddress()) + ":") + (session.remotePort())));
    org.voovan.tools.log.Logger.simple(("Client onRecive: " + (obj.toString())));
    org.voovan.tools.log.Logger.simple(("Attribute onRecive: " + (session.getAttribute("key"))));
    session.close();
    return obj;
}