boolean willDeadlock(int thread, int lock) {
    for (; ((lock != (-1)) && ((lockHolder[lock]) != thread)) && ((lockHolder[lock]) != (-1));) {
        lock = resourceWait[lockHolder[lock]];
    }
    return (lock == (-1)) || ((lockHolder[lock]) == thread);
}