public java.lang.String writeToCache(java.lang.Object object) {
    if ((cacheStorage.size()) == (cacheSize)) {
    }
    cacheStorage.put(java.lang.String.valueOf(object.hashCode()), object);
    return java.lang.String.valueOf(object.hashCode());
}