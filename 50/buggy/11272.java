@java.lang.Override
public void initialize() {
    if ((port) == null) {
        m_coapServer = new org.eclipse.californium.core.CoapServer(port);
    }else {
        m_coapServer = new org.eclipse.californium.core.CoapServer();
    }
}