@java.lang.Override
public boolean isTerminated() {
    lock.lock();
    try {
        return (shutdown) && ((runningTasks) == 0);
    } finally {
        lock.unlock();
    }
}