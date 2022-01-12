private void create(java.lang.String key, byte[] data, org.apache.zookeeper.CreateMode mode) throws java.lang.InterruptedException, org.apache.zookeeper.KeeperException {
    java.lang.String path = getPath(key);
    _zk.create(path, data, _acl, mode);
    com.probestar.dynamicrouting.zk.ZKConnection._tracer.info("Path %s has been created.", path);
}