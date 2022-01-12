@java.lang.Override
public void obtainLock(org.axonframework.domain.AggregateIdentifier aggregateIdentifier) {
    boolean lockObtained = false;
    while (!lockObtained) {
        createLockIfAbsent(aggregateIdentifier);
        org.axonframework.repository.PessimisticLockManager.DisposableLock lock = lockFor(aggregateIdentifier);
        lockObtained = lock.lock();
        if (!lockObtained) {
            locks.remove(aggregateIdentifier, lock);
        }
    } 
}