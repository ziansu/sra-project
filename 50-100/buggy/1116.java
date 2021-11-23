public void factoryClosed(final org.apache.activemq.artemis.api.core.client.ClientSessionFactory factory) {
    synchronized(factories) {
        factories.remove(factory);
        if ((!(clusterConnection)) && (factories.isEmpty())) {
            synchronized(topologyArrayGuard) {
                receivedTopology = false;
                topologyArray = null;
            }
        }
    }
}