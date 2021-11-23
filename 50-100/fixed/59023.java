private void caching(java.lang.String key, com.keyvalue4j.Entity entity) {
    if ((cache.size()) < 4000) {
        cache.put(key, entity);
    }else {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> iterator = cache.entrySet().iterator();
        for (int i = 0; i < 30; i++) {
            iterator.next();
            iterator.remove();
        }
    }
}