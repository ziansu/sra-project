private void doTrashConnection(com.datastax.driver.core.Connection connection) {
    trash.add(connection);
    connectionRef.compareAndSet(connection, null);
    if (((connection.inFlight.get()) == 0) && (trash.remove(connection)))
        close(connection);
    
}