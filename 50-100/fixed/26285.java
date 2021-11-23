public java.util.function.Predicate<V> get(K key) {
    xyz.openmodloader.util.CollectionPredicate<V> value = map.get(key);
    if (value != null) {
        return value;
    }else {
        value = new xyz.openmodloader.util.CollectionPredicate(com.google.common.collect.Sets.newConcurrentHashSet());
        map.put(key, value);
        return value;
    }
}