public void removeConnection(net.md_5.bungee.UserConnection con) {
    connectionLock.writeLock().lock();
    try {
        if ((connections.get(con.getName())) == con) {
            connections.remove(con.getName());
            connectionsByOfflineUUID.remove(con.getPendingConnection().getOfflineId());
        }
    } finally {
        connectionLock.writeLock().unlock();
    }
}