@java.lang.Override
public void putAll(org.jetbrains.ether.dependencyView.MultiMaplet<K, V> m) {
    for (java.util.Map.Entry<K, java.util.Collection<V>> entry : m.entrySet()) {
        put(entry.getKey(), entry.getValue());
    }
}