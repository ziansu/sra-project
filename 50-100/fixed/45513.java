@java.lang.Override
public void factoryClosed(final org.apache.activemq.artemis.api.core.client.ClientSessionFactory factory) {
    boolean isEmpty;
    synchronized(factories) {
        factories.remove(factory);
        isEmpty = factories.isEmpty();
    }
    if ((!(clusterConnection)) && isEmpty) {
        receivedTopology = false;
        topologyArray = null;
    }
}