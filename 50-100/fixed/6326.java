@java.lang.Override
public void connectionRemoved(com.hazelcast.nio.Connection connection) {
    if (connection.getEndPoint().equals(ownerConnectionAddress)) {
        if (client.getLifecycleService().isRunning()) {
            fireConnectionEvent(LifecycleEvent.LifecycleState.CLIENT_DISCONNECTED);
            clusterExecutor.execute(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    try {
                        connectToCluster();
                    } catch (java.lang.Exception e) {
                        logger.warning("Could not re-connect to cluster shutting down the client", e);
                        client.getLifecycleService().shutdown();
                    }
                }
            });
        }
    }
}