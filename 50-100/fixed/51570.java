public void add(java.lang.String key) {
    com.jasonsavlov.WordNode existing;
    try {
        mLock.lock();
        existing = get(key);
        if (existing != null) {
            (existing.frequency)++;
            return ;
        }
        put(key, new com.jasonsavlov.WordNode(key));
    } finally {
        mLock.unlock();
    }
}