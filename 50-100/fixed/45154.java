private java.util.Set<java.util.UUID> putIgnoreCache(java.util.UUID uuid, java.lang.String data) {
    java.util.HashSet<java.util.UUID> dataSet = new java.util.HashSet<>();
    if ((data != null) && (!(data.isEmpty()))) {
        for (java.lang.String entry : data.split(",")) {
            dataSet.add(java.util.UUID.fromString(entry));
        }
    }
    synchronized(ignoreCache) {
        ignoreCache.put(uuid, dataSet);
    }
    return dataSet;
}