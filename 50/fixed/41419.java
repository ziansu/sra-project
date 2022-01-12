@java.lang.Override
public void run() {
    try {
        connectToCluster();
    } catch (java.lang.Exception e) {
        logger.warning("Could not re-connect to cluster shutting down the client", e);
        client.getLifecycleService().shutdown();
    }
}