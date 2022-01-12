public com.github.ilyamurzinov.datastructures.maps.HashMap.HashMapEntry<K, V> nextEntry() {
    com.github.ilyamurzinov.datastructures.maps.HashMap.HashMapEntry<K, V> tmp = next;
    if ((next.next) != null) {
        next = next.next;
    }
    (currentBucket)++;
    while (((currentBucket) < (buckets.length)) && ((buckets[currentBucket]) == null))
        (currentBucket)++;
    
    next = ((currentBucket) < (buckets.length)) ? buckets[currentBucket] : null;
    return tmp;
}