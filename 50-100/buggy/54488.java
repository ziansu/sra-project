@java.lang.Override
public com.jivesoftware.os.miru.plugin.partition.MiruQueryablePartition<?> apply(com.jivesoftware.os.miru.plugin.partition.MiruRoutablePartition input) {
    com.jivesoftware.os.miru.api.MiruPartitionCoord key = new com.jivesoftware.os.miru.api.MiruPartitionCoord(tenantId, input.partitionId, input.host);
    if (input.local) {
        com.google.common.base.Optional<com.jivesoftware.os.miru.service.partition.MiruLocalHostedPartition<?>> partition = localTopology.getPartition(key);
        return partition.orNull();
    }else {
        return remotePartitionFactory.create(key, new com.jivesoftware.os.miru.api.MiruPartitionCoordInfo(input.state, input.storage));
    }
}