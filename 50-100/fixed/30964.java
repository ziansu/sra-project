@org.junit.Test
public void testRequestExceedPoolCapacity() throws java.lang.Exception {
    final long capacity = 1024;
    final long maxBlockTimeInMs = 200;
    com.github.ambry.utils.SimpleByteBufferPool pool = new com.github.ambry.utils.SimpleByteBufferPool(capacity);
    try {
        pool.allocate((((int) (capacity)) + 1), maxBlockTimeInMs);
        fail("Should have thrown!");
    } catch (java.lang.IllegalArgumentException e) {
    }
}