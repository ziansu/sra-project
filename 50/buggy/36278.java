@java.lang.Override
public void setTransport(org.protege.owl.server.api.server.TransportHandler transport) throws org.protege.owl.server.api.exception.OWLServerException {
    try {
        transport.bind(this);
    } catch (java.lang.Exception e) {
        throw new org.protege.owl.server.api.exception.OWLServerException(e);
    }
}