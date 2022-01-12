@java.lang.Override
public void processResult(int rc, java.lang.String path, java.lang.Object ctx, byte[] data, org.apache.zookeeper.data.Stat stat) {
    trace.commit();
    org.apache.curator.framework.api.CuratorEvent event = new org.apache.curator.framework.imps.CuratorEventImpl(client, org.apache.curator.framework.api.CuratorEventType.GET_CONFIG, rc, path, null, ctx, stat, data, null, null, null, null);
    client.processBackgroundOperation(operationAndData, event);
}