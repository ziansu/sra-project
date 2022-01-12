private void invoke(com.hazelcast.client.impl.protocol.ClientMessage request) {
    try {
        com.hazelcast.client.spi.impl.ClientInvocation invocation = new com.hazelcast.client.spi.impl.ClientInvocation(instance, request, null);
        com.hazelcast.client.spi.impl.ClientInvocationFuture future = invocation.invoke();
        com.hazelcast.client.impl.protocol.ClientMessage response = future.get();
    } catch (java.lang.Exception e) {
        throw com.hazelcast.util.ExceptionUtil.rethrow(e);
    }
}