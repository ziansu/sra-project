@java.lang.Override
public void start(org.apache.flink.runtime.leaderelection.LeaderContender contender) throws java.lang.Exception {
    com.google.common.base.Preconditions.checkNotNull(contender, "Contender must not be null.");
    com.google.common.base.Preconditions.checkState(((leaderContender) == null), "Contender was already set.");
    org.apache.flink.runtime.leaderelection.ZooKeeperLeaderElectionService.LOG.info("Starting ZooKeeperLeaderElectionService.");
    leaderContender = contender;
    org.apache.curator.utils.EnsurePath ensurePath = client.newNamespaceAwareEnsurePath(leaderPath);
    ensurePath.ensure(client.getZookeeperClient());
    leaderLatch.addListener(this);
    leaderLatch.start();
    cache.getListenable().addListener(this);
    cache.start();
}