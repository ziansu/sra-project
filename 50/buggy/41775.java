@java.lang.Override
public boolean isShutdown() {
    lock.lock();
    try {
        return shutdown;
    } finally {
        lock.unlock();
    }
}