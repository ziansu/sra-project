public synchronized java.util.Set<org.apache.kafka.common.Node> getNodes() {
    return new java.util.HashSet(unsent.keySet());
}