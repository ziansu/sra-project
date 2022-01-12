private void replaceConnection(com.datastax.driver.core.Connection connection) {
    if (!(connection.state.compareAndSet(State.OPEN, State.TRASHED)))
        open.set(false);
    
    maybeSpawnNewConnection();
    doTrashConnection(connection);
}