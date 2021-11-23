private void populateNearCache(com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> map, int size) {
    for (int i = 0; i < size; i++) {
        map.put(i, i);
    }
    for (int i = 0; i < size; i++) {
        map.get(i);
    }
}