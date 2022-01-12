@javax.annotation.Nullable
public java.lang.String getQueue(co.cask.cdap.proto.Id.Namespace namespaceId) {
    co.cask.cdap.proto.NamespaceMeta meta = store.getNamespace(namespaceId);
    if (meta != null) {
        co.cask.cdap.proto.NamespaceConfig config = meta.getConfig();
        return (config.getSchedulerQueueName()) != null ? config.getSchedulerQueueName() : getDefaultQueue();
    }else {
        return getDefaultQueue();
    }
}