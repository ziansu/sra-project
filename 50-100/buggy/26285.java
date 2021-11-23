public void register(K key, java.util.function.Predicate<V> value) {
    xyz.openmodloader.util.CollectionPredicate<V> collection = map.get(key);
    if (collection != null) {
        collection = new xyz.openmodloader.util.CollectionPredicate(com.google.common.collect.Sets.newConcurrentHashSet());
        map.put(key, collection);
    }
    collection.add(value);
}