@org.junit.Test
public void testRequestExceedPoolCapacity() throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    final long capacity = 1024;
    final long maxBlockTimeInMs = 200;
    com.github.ambry.utils.SimpleByteBufferPool pool = new com.github.ambry.utils.SimpleByteBufferPool(capacity);
    try {
        java.nio.ByteBuffer buffer = pool.allocate((((int) (capacity)) + 1), maxBlockTimeInMs);
        fail("Should have thrown!");
    } catch (java.lang.IllegalArgumentException e) {
    }
}