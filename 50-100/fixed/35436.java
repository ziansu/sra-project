@org.junit.Test
public void testCloseListener() throws java.io.IOException, java.lang.InterruptedException {
    final java.util.concurrent.atomic.AtomicInteger acc = new java.util.concurrent.atomic.AtomicInteger(0);
    com.moilioncircle.redis.replicator.RedisReplicator replicator = new com.moilioncircle.redis.replicator.RedisReplicator("127.0.0.1", 6666, com.moilioncircle.redis.replicator.Configuration.defaultSetting());
    replicator.addCloseListener(new com.moilioncircle.redis.replicator.CloseListener() {
        @java.lang.Override
        public void handle(com.moilioncircle.redis.replicator.Replicator replicator) {
            acc.incrementAndGet();
        }
    });
    replicator.open();
    assertEquals(1, acc.get());
}