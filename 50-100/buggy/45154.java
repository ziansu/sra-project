private java.util.Set<java.util.UUID> putIgnoreCache(java.util.UUID uuid, java.lang.String data) {
    if (data == null) {
        synchronized(ignoreCache) {
            ignoreCache.remove(uuid);
        }
        return null;
    }
    java.util.HashSet<java.util.UUID> dataSet = new java.util.HashSet<>();
    for (java.lang.String entry : data.split(",")) {
        dataSet.add(java.util.UUID.fromString(entry));
    }
    ignoreCache.put(uuid, dataSet);
    return dataSet;
}