public V put(K key, V value, int priority) {
    V tmp = this.get(key);
    if (tmp != null) {
        this.add(key, value, priority);
        return tmp;
    }else {
        this.add(key, value, priority);
        return null;
    }
}