public static java.nio.ByteBuffer randomBytes(int quantity, java.util.concurrent.ThreadLocalRandom tlr) {
    java.nio.ByteBuffer slice = java.nio.ByteBuffer.allocate(quantity);
    java.nio.ByteBuffer source = org.apache.cassandra.db.commitlog.CommitLogStressTest.dataSource.duplicate();
    source.position(tlr.nextInt(((source.capacity()) - quantity)));
    source.limit(((source.position()) + quantity));
    slice.put(source);
    slice.flip();
    return slice;
}