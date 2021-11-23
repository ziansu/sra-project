boolean willDeadlock(int thread, int lock) {
    for (; ((lockHolder[lock]) != thread) && ((lockHolder[lock]) != (-1));) {
        lock = resourceWait[lockHolder[lock]];
        nachos.threads.Lib.assertTrue((lock != (-1)));
    }
    return (lockHolder[lock]) == thread;
}