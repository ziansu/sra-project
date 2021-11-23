@java.lang.Override
public void stop() throws java.lang.Exception {
    org.apache.flink.runtime.leaderretrieval.ZooKeeperLeaderRetrievalService.LOG.info("Stopping ZooKeeperLeaderRetrievalService.");
    client.getConnectionStateListenable().removeListener(connectionStateListener);
    cache.close();
}