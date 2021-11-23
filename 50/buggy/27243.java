@java.lang.SuppressWarnings(value = "unchecked")
public TKey getKey(int index) {
    rLock.lock();
    TKey key;
    try {
        key = this.keys.get(index);
    } finally {
        rLock.unlock();
    }
    return key;
}