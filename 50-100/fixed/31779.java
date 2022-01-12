@java.lang.Override
public void run() {
    final java.lang.Object lock = getLock(target);
    synchronized(lock) {
        com.hazelcast.client.connection.nio.ClientConnection connection = connections.get(target);
        if (connection != null) {
            return ;
        }
        try {
            initializeConnection(remoteAddress, authenticator);
        } catch (java.lang.Exception e) {
            logger.finest(e);
        } finally {
            connectionsInProgress.remove(target);
        }
    }
}