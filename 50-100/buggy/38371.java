@javax.annotation.PostConstruct
public void init() throws java.io.IOException, java.lang.InterruptedException {
    org.apache.accumulo.minicluster.impl.MiniAccumuloConfigImpl config = new org.apache.accumulo.minicluster.impl.MiniAccumuloConfigImpl(tempDir, password);
    config.setZooKeeperStartupTime(100000);
    cluster = new org.apache.accumulo.minicluster.impl.MiniAccumuloClusterImpl(config);
    cluster.start();
    zookeepers = cluster.getZooKeepers();
    instance = cluster.getInstanceName();
    cluster.start();
}