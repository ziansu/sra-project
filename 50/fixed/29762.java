@java.lang.Override
public void handle(com.moilioncircle.redis.replicator.Replicator replicator, com.moilioncircle.redis.replicator.rdb.datatype.KeyValuePair<?> kv) {
    acc.incrementAndGet();
}