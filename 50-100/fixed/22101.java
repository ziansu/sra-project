public java.util.ArrayList<V> add(K key) {
    java.util.ArrayList<V> list = this.get(key);
    if (list == null) {
        list = new java.util.ArrayList<V>();
        this.put(key, list);
    }
    return list;
}