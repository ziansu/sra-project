public void shutdown() {
    isShutdown = true;
    responseThread.interrupt();
    java.util.Iterator<com.hazelcast.client.spi.impl.ClientInvocation> iterator = callIdMap.values().iterator();
    while (iterator.hasNext()) {
        com.hazelcast.client.spi.impl.ClientInvocation invocation = iterator.next();
        iterator.remove();
        invocation.notifyException(new com.hazelcast.client.HazelcastClientNotActiveException("Client is shutting down"));
    } 
    assert callIdMap.isEmpty();
}