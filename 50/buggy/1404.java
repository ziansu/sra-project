public void removeLock(java.lang.Object lock) {
    heldLocks &= ~(2 << (getLockID(lock, null)));
}