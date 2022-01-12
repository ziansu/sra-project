private static int iterate(com.orctom.rmq.RocksIterator iterator) {
    int count = 0;
    for (iterator.seekToFirst(); iterator.isValid(); iterator.next()) {
        java.lang.String key = new java.lang.String(iterator.key());
        java.lang.String value = new java.lang.String(iterator.value());
        com.orctom.rmq.RockStore.LOGGER.trace("{} -> {}", key, value);
        count++;
    }
    return count;
}