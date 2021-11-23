private void create(java.lang.String key, byte[] data, org.apache.zookeeper.CreateMode mode) throws java.lang.InterruptedException {
    java.lang.String path = getPath(key);
    try {
        if (!(exists(key))) {
            _zk.create(path, data, _acl, mode);
            com.probestar.dynamicrouting.zk.ZKConnection._tracer.info("Path %s has been created.", path);
        }
    } catch (org.apache.zookeeper.KeeperException e) {
        com.probestar.dynamicrouting.zk.ZKConnection._tracer.error(((("ZKConnection.create error. key: " + key) + "; data: ") + (com.probestar.psutils.PSConvert.bytes2HexString(data))), e);
    }
}