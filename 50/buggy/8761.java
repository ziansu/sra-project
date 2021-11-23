public java.util.Set<org.apache.activemq.artemis.core.client.impl.ClientProducerInternal> cloneProducers() {
    java.util.Set<org.apache.activemq.artemis.core.client.impl.ClientProducerInternal> producersClone;
    synchronized(producers) {
        producersClone = new java.util.HashSet<org.apache.activemq.artemis.core.client.impl.ClientProducerInternal>(producers);
    }
    return producersClone;
}