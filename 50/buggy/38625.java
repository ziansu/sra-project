private void fireDataChanged(java.lang.String path) throws java.lang.InterruptedException, org.apache.zookeeper.KeeperException {
    byte[] data = get(path);
    for (com.probestar.dynamicrouting.zk.ZKConnectionEvent event : _events)
        event.onDataChanged(data);
    
}