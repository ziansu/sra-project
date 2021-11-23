@javax.annotation.Nullable
public java.lang.String getQueue(co.cask.cdap.proto.Id.Namespace namespaceId) {
    co.cask.cdap.proto.NamespaceMeta meta = store.getNamespace(namespaceId);
    com.google.common.base.Preconditions.checkNotNull(meta, "Namespace meta cannot be null");
    co.cask.cdap.proto.NamespaceConfig config = meta.getConfig();
    return (config.getSchedulerQueueName()) != null ? config.getSchedulerQueueName() : getDefaultQueue();
}