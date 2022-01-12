@com.google.common.annotations.VisibleForTesting
@org.apache.hadoop.classification.InterfaceAudience.Private
@org.apache.hadoop.classification.InterfaceStability.Unstable
protected synchronized org.apache.zookeeper.ZooKeeper getNewZooKeeper() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.System.setProperty("jute.maxbuffer", java.lang.Integer.toString(zkJuteMaxBuffer));
    org.apache.zookeeper.ZooKeeper zk = new org.apache.zookeeper.ZooKeeper(zkHostPort, zkSessionTimeout, null);
    zk.register(new org.apache.hadoop.yarn.server.resourcemanager.recovery.ZKRMStateStore.ForwardingWatcher(zk));
    return zk;
}