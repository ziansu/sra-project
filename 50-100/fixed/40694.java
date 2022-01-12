@java.lang.Override
public void replaceAll(org.jetbrains.ether.dependencyView.MultiMaplet<K, V> m) {
    for (java.util.Map.Entry<K, java.util.Collection<V>> entry : m.entrySet()) {
        final K key = entry.getKey();
        remove(key);
        put(key, entry.getValue());
    }
}