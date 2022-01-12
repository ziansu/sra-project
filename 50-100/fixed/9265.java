@java.lang.Override
public V put(K key, V value) {
    V val = buckets.get(((java.lang.Math.abs(key.hashCode())) % (bucketCount))).add(key, value);
    if (toReorganize) {
        reorganize();
        toReorganize = false;
    }
    return val;
}