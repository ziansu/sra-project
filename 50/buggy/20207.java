@java.lang.Override
public void clear() {
    capacity = com.github.ilyamurzinov.datastructures.maps.HashMap.DEFAULT_CAPACITY;
    buckets = new com.github.ilyamurzinov.datastructures.maps.HashMap.HashMapEntry[capacity];
}