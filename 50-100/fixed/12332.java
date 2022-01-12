public void shutDown() {
    try {
        lookupService.shutDown();
    } catch (java.lang.Throwable t) {
        org.apache.flink.runtime.query.QueryableStateClient.LOG.error("Failed to shut down KvStateLookupService", t);
    }
    try {
        kvStateClient.shutDown();
    } catch (java.lang.Throwable t) {
        org.apache.flink.runtime.query.QueryableStateClient.LOG.error("Failed to shut down KvStateClient", t);
    }
    if ((actorSystem) != null) {
        try {
            actorSystem.shutdown();
        } catch (java.lang.Throwable t) {
            org.apache.flink.runtime.query.QueryableStateClient.LOG.error("Failed to shut down ActorSystem", t);
        }
    }
}