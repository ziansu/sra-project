@java.lang.Override
public void releaseConnection() {
    org.opendaylight.protocol.bgp.rib.impl.SimpleSessionListener.LOG.debug("Releasing connection");
    if ((this.session) != null) {
        try {
            this.session.close();
        } catch (final java.lang.Exception e) {
            org.opendaylight.protocol.bgp.rib.impl.SimpleSessionListener.LOG.warn("Error closing session", e);
        }
        this.session = null;
    }
}