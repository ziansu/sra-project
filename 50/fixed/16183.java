public boolean isConnected() {
    return (pool.getState()) == (Session.State.open);
}