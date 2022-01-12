private void doTrashConnection(com.datastax.driver.core.Connection connection) {
    connectionRef.compareAndSet(connection, null);
    trash.add(connection);
    if (((connection.inFlight.get()) == 0) && (trash.remove(connection)))
        close(connection);
    
}