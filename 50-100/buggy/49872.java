@java.lang.Override
public <E> com.bc.jpa.search.SearchResults<E> remove(java.lang.String sessionId, java.lang.Class<E> entityType, boolean close) {
    try {
        lock.lock();
        java.util.Map<java.lang.String, com.bc.jpa.search.SearchResults> sessionCache = typeCache.get(entityType);
        com.bc.jpa.search.SearchResults<E> output = (sessionCache == null) ? null : sessionCache.remove(sessionId);
        if ((output != null) && close) {
            output.close();
        }
        return output;
    } finally {
        lock.unlock();
    }
}