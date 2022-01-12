public void removeConnection(net.md_5.bungee.UserConnection con) {
    connectionLock.writeLock().lock();
    try {
        connections.remove(con.getName());
        connectionsByOfflineUUID.remove(con.getPendingConnection().getOfflineId());
    } finally {
        connectionLock.writeLock().unlock();
    }
}