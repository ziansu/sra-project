private int indexOf(K key) {
    int k = (java.lang.Math.abs(key.hashCode())) % (hashingKey);
    if (k >= (array.length))
        k = k - ((k / (array.length)) * (array.length));
    
    return k;
}