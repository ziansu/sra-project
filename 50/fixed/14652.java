@java.lang.Override
public void setRoute(java.lang.String domain, java.lang.String address) {
    transportRoutes.setRoute(domain, RmiTransport.PROTOCOL, address, 0, true);
}