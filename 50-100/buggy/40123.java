@org.junit.Test
public void lock() {
    final java.lang.String lockName = java.util.UUID.randomUUID().toString();
    com.aol.micro.server.utility.DistributedLockService lock = provider.getDistributedLock(1000);
    org.junit.Assert.assertTrue(lock.tryLock(lockName));
    com.aol.micro.server.utility.DistributedLockService lock2 = provider.getDistributedLock(1000);
    org.junit.Assert.assertFalse(lock2.tryLock(lockName));
}