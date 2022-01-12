void returnConnection(org.glassfish.grizzly.Connection result, ru.kwanza.jeda.nio.client.ConnectionConfig config, boolean close) {
    if (result != null) {
        ru.kwanza.jeda.nio.client.ConnectionHolder holder = leasedConnections.remove(result);
        if (config.isKeepAlive()) {
            if (((holder != null) && (result.isOpen())) && (!close)) {
                availableConnections.offer(holder);
                getStage().getThreadManager().adjustThreadCount(getStage(), getThreadCount());
            }
        }
    }
    batchSize.incrementAndGet();
}