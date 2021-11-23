@java.lang.Override
public void processResult(int rc, java.lang.String path, java.lang.Object ctx, byte[] bytes, org.apache.zookeeper.data.Stat stat) {
    trace.commit();
    if (((responseStat) != null) && (stat != null)) {
        org.apache.zookeeper.server.DataTree.copyStat(stat, responseStat);
    }
    org.apache.curator.framework.imps.CuratorEvent event = new org.apache.curator.framework.imps.CuratorEventImpl(client, CuratorEventType.RECONFIG, rc, path, null, ctx, stat, bytes, null, null, null, null);
    client.processBackgroundOperation(data, event);
}