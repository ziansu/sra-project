public void removeLock(java.lang.Object lock) {
    heldLocks &= ~(1 << (getLockID(lock, null)));
}