@java.lang.Override
public int size() {
    lock.lock();
    try {
        return elements.size();
    } finally {
        lock.unlock();
    }
}