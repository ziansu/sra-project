private int getBucketIndex(java.lang.Object key) {
    return getBucketIndex(key, getCurrentCapacity());
}