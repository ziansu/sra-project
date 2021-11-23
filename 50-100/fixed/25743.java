@org.junit.Test
public void testTryAcquire() {
    com.google.api.gax.batching.Semaphore64 sema = new com.google.api.gax.batching.Semaphore64(1);
    org.junit.Assert.assertTrue(sema.tryAcquire(1));
    org.junit.Assert.assertFalse(sema.tryAcquire(1));
    sema.release(1);
    org.junit.Assert.assertTrue(sema.tryAcquire(1));
}