public void shutdownServer() {
    if ((server) != null) {
        try {
            ((com.orientechnologies.orient.server.hazelcast.OHazelcastPlugin) (server.getDistributedManager())).getHazelcastInstance().shutdown();
        } catch (java.lang.Exception e) {
        }
        server.shutdown();
    }
    closeStorages();
}