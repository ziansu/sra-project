public void putItem(K key, V value) {
    try {
        get(key).add(value);
    } catch (java.lang.NullPointerException e) {
        java.util.TreeSet<V> newtree = new java.util.TreeSet<>();
        newtree.add(value);
        hash.put(key, newtree);
    }
}