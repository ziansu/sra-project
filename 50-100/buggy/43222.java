@org.junit.Test(expected = org.sagebionetworks.repo.model.exception.LockReleaseFailedException.class)
public void testRefreshExpiredLock() throws java.lang.InterruptedException {
    java.lang.String key = "sampleKey";
    int maxLockCount = 1;
    long timeoutSec = 1;
    java.lang.String token1 = semaphore.attemptToAcquireLock(key, timeoutSec, maxLockCount);
    org.junit.Assert.assertNotNull(token1);
    java.lang.Thread.sleep(((timeoutSec * 1000) * 2));
    java.lang.String token2 = semaphore.attemptToAcquireLock(key, timeoutSec, maxLockCount);
    org.junit.Assert.assertNotNull(token2);
    semaphore.refreshLockTimeout(key, token1, timeoutSec);
}