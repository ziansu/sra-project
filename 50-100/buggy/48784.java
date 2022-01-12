@java.lang.Override
public void toXContent(org.elasticsearch.common.xcontent.XContentBuilder builder, org.elasticsearch.index.shard.ShardStateMetaData shardStateMetaData) throws java.io.IOException {
    builder.field(org.elasticsearch.index.shard.ShardStateMetaData.VERSION_KEY, shardStateMetaData.version);
    builder.field(org.elasticsearch.index.shard.ShardStateMetaData.PRIMARY_KEY, shardStateMetaData.primary);
    builder.field(org.elasticsearch.index.shard.ShardStateMetaData.INDEX_UUID_KEY, shardStateMetaData.indexUUID);
    builder.field(org.elasticsearch.index.shard.ShardStateMetaData.ALLOCATION_ID_KEY, shardStateMetaData.allocationId);
}