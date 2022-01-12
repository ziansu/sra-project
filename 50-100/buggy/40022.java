@java.lang.Override
public V get(K key) {
    lock.lock();
    try {
        com.otus.alexeenko.l8ah.services.custom.cache.CacheEngine<K, V>.Value value = cache.get(key);
        if (value != null) {
            if (!(isExpiryTimeStamp(value.getTimeStamp()))) {
                (value.usageCounter)++;
                lock.unlock();
                return value.getValue();
            }
        }
    } finally {
        lock.unlock();
    }
    return null;
}