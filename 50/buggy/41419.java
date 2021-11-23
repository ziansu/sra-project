@java.lang.Override
public void run() {
    try {
        fireConnectionEvent(LifecycleEvent.LifecycleState.CLIENT_DISCONNECTED);
        connectToCluster();
    } catch (java.lang.Exception e) {
        logger.warning("Could not re-connect to cluster shutting down the client", e);
        client.getLifecycleService().shutdown();
    }
}