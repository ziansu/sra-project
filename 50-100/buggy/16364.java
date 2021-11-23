public void putAll(net.sf.jpasecurity.util.CollectionMap<? extends K, ? extends C, ? extends V> map) {
    for (java.util.Map.Entry<? extends K, ? extends C> entry : map.entrySet()) {
        addAll(entry.getKey(), entry.getValue());
    }
}