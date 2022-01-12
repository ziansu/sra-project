@org.junit.Test
public void testRefreshLockTimeout() throws java.lang.InterruptedException {
    java.lang.String key = "sampleKey";
    int maxLockCount = 1;
    long timeoutSec = 2;
    java.lang.String token1 = semaphore.attemptToAcquireLock(key, timeoutSec, maxLockCount);
    org.junit.Assert.assertNotNull(token1);
    for (int i = 0; i < (timeoutSec + 1); i++) {
        semaphore.refreshLockTimeout(key, token1, timeoutSec);
        java.lang.Thread.sleep(1000);
    }
    semaphore.releaseLock(key, token1);
}