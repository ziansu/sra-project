public static <K, V> java.util.Map<K, V> createHashMap(int expectedMapSize) {
    int initialCapacity = ((int) (expectedMapSize / (com.hazelcast.util.MapUtil.HASHMAP_DEFAULT_LOAD_FACTOR))) + 1;
    return new java.util.HashMap<K, V>(initialCapacity);
}