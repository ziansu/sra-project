@java.lang.Override
void replaceDefunctConnection(final com.datastax.driver.core.Connection connection) {
    if (connection.state.compareAndSet(com.datastax.driver.core.OPEN, com.datastax.driver.core.GONE))
        open.decrementAndGet();
    
    if (connections.remove(connection))
        manager.blockingExecutor().submit(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                addConnectionIfUnderMaximum();
            }
        });
    
}