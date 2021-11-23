@java.lang.Override
public void replaceDefunctConnection(final com.datastax.driver.core.Connection connection) {
    if (connection.state.compareAndSet(State.OPEN, State.GONE))
        open.set(false);
    
    connectionRef.compareAndSet(connection, null);
    connection.closeAsync();
    manager.blockingExecutor().submit(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            addConnectionIfNeeded();
        }
    });
}