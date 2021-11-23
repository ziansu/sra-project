public void putCollection(K key, java.util.Collection<V> collection) {
    get(key).addAll(collection);
}