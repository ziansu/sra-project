public void addLock(java.lang.Object lock, java.lang.String description) {
    int id = getLockID(lock, description);
    heldLocks |= 1 << id;
}