public void insert(K key, V value, boolean update) {
    boolean collided = buckets.get(getIndex(key)).insert(key, value);
    (mapSize)++;
    if (collided && (((buckets.size()) / 2) <= (size()))) {
        growBuckets();
    }
}