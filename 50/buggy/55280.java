public com.n247s.util.collection.ListMap.SubMap<K, V> tailMap(int fromIndex, boolean inclusiveKey) {
    return new com.n247s.util.collection.ListMap.SubMap<K, V>(this, false, fromIndex, inclusiveKey, true, (-1), true);
}