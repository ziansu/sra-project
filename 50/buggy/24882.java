public final boolean isSnapShotIsolation() {
    return (this.lockPolicy) == (com.gemstone.gemfire.internal.cache.locks.LockingPolicy.SNAPSHOT);
}