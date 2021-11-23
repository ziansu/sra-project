@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testNegative() {
    com.google.api.gax.batching.Semaphore64 sema = new com.google.api.gax.batching.Semaphore64(1);
    sema.tryAcquire((-1));
}