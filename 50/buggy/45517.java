private int hashValue(java.lang.Object key) {
    return ((java.lang.Math.abs(key.hashCode())) % 109345121) % (arraySize);
}