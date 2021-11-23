private void pullEntriesToNearCache(com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> map, int mapSize) {
    for (int i = 0; i < mapSize; i++) {
        map.get(i);
    }
}