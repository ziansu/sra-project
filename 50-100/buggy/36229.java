private void setPair(int hash, K key, V value, int index) {
    Pair<K, V> e = table[index];
    while (e != null) {
        index++;
        if (index >= (capacity)) {
            resizeTable();
            java.lang.System.out.println("Be careful it is going recursive");
            put(key, value);
            return ;
        }
        e = table[index];
    } 
    table[index] = new Pair(key, value);
    (size)++;
}