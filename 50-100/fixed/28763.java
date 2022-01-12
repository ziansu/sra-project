private void getLock(final org.opendaylight.yangtools.yang.binding.InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.opendaylight.genius.lockmanager.rev160413.locks.Lock> lockInstanceIdentifier, final org.opendaylight.yang.gen.v1.urn.opendaylight.genius.lockmanager.rev160413.locks.Lock lockData) throws java.lang.InterruptedException {
    for (int retry = 1; ; retry++) {
        try {
            if (readWriteLock(lockInstanceIdentifier, lockData)) {
                return ;
            }else {
                org.opendaylight.lockmanager.LockManager.LOG.info("Already locked after waiting {}ms, try {}", org.opendaylight.lockmanager.LockManager.DEFAULT_WAIT_TIME_IN_MILLIS, retry);
            }
        } catch (java.util.concurrent.ExecutionException e) {
            org.opendaylight.lockmanager.LockManager.LOG.error("Unable to acquire lock, try {}", retry, e);
        }
        java.lang.Thread.sleep(org.opendaylight.lockmanager.LockManager.DEFAULT_WAIT_TIME_IN_MILLIS);
    }
}