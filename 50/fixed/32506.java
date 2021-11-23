@java.lang.Override
public void onSessionUp(final org.opendaylight.protocol.bgp.rib.spi.BGPSession session) {
    org.opendaylight.protocol.bgp.rib.impl.SimpleSessionListener.LOG.debug("Session Up");
    this.session = session;
}