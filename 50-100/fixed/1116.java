public void factoryClosed(final org.apache.activemq.artemis.api.core.client.ClientSessionFactory factory) {
    boolean isEmpty;
    synchronized(factories) {
        factories.remove(factory);
        isEmpty = factories.isEmpty();
    }
    if ((!(clusterConnection)) && isEmpty) {
        synchronized(topologyArrayGuard) {
            receivedTopology = false;
            topologyArray = null;
        }
    }
}