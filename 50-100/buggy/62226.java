private int indexOf(K key) {
    int k = (key.hashCode()) % (hashingKey);
    if (k >= (array.length))
        k = k - ((k / (array.length)) * (array.length));
    
    return k;
}