@java.lang.Override
public void processResult(int rc, java.lang.String path, java.lang.Object ctx) {
    trace.commit();
    org.apache.curator.framework.api.CuratorEvent event = new org.apache.curator.framework.imps.CuratorEventImpl(client, org.apache.curator.framework.api.CuratorEventType.REMOVE_WATCHES, rc, path, null, ctx, null, null, null, null, null);
    client.processBackgroundOperation(operationAndData, event);
}