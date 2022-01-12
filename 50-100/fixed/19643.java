@java.lang.Override
public <T> boolean putIfAbsent(org.jayware.e2.util.Key<T> key, T value) {
    org.jayware.e2.util.Preconditions.checkNotNull(key, "Key mustn't be null!");
    myWriteLock.lock();
    try {
        if (!(myMap.containsKey(key))) {
            checkDisposing();
            myMap.put(key, value);
            return true;
        }
        return false;
    } finally {
        myWriteLock.unlock();
    }
}