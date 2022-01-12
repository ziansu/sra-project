public void add(K key, V value) {
    if (this.toEnd)
        this.listMap.add(key, value);
    else
        this.listMap.put(((this.toEntry) + 1), key, value);
    
    (this.toEntry)++;
}