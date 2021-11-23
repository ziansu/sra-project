@java.lang.Override
public <T> T get(java.lang.Class<T> type) {
    org.graylog2.cluster.ClusterConfig config = dbCollection.findOne(org.mongojack.DBQuery.is("type", type.getCanonicalName()));
    if (config == null) {
        org.graylog2.cluster.ClusterConfigServiceImpl.LOG.debug("Couldn't find cluster config of type {}", type.getCanonicalName());
        return null;
    }
    T result = extractPayload(config.payload(), type);
    if (result == null) {
        org.graylog2.cluster.ClusterConfigServiceImpl.LOG.error("Couldn't extract payload from cluster config (type: {})", type.getCanonicalName());
    }
    return result;
}