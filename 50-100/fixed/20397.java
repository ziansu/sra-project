@java.lang.Override
public org.pinus4j.entity.meta.PKValue save(java.lang.Object entity, org.pinus4j.cluster.beans.IShardingKey<?> shardingKey) {
    org.pinus4j.entity.meta.PKValue[] pkValues = saveBatch(com.google.common.collect.Lists.newArrayList(entity), shardingKey, true);
    if ((pkValues != null) && ((pkValues.length) > 0)) {
        return pkValues[0];
    }
    return null;
}