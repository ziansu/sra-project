@java.lang.Override
public void connectionClosed(javax.resource.spi.ConnectionEvent event) {
    connections.remove(event.getSource());
    try {
        ((javax.resource.spi.ManagedConnection) (event.getSource())).cleanup();
    } catch (javax.resource.ResourceException e) {
        org.apache.activemq.ra.ConnectionManagerAdapter.LOG.warn("Error occured during the cleanup of a managed connection: ", e);
    }
    try {
        ((javax.resource.spi.ManagedConnection) (event.getSource())).destroy();
    } catch (javax.resource.ResourceException e) {
        org.apache.activemq.ra.ConnectionManagerAdapter.LOG.warn("Error occured during the destruction of a managed connection: ", e);
    }
}