public void add(K key, V value) {
    java.util.ArrayList<V> list = this.get(key);
    if (list == null) {
        list = new java.util.ArrayList<V>();
        this.put(key, list);
    }
    list.add(value);
}