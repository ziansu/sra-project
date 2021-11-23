public void putItem(K key, V value) {
    try {
        get(key).add(value);
    } catch (java.lang.NullPointerException e) {
        java.util.List<V> newlist = new java.util.ArrayList<>();
        newlist.add(value);
        hash.put(key, newlist);
    }
}