private int hashValue(java.lang.Object key) {
    return (key.hashCode()) % (arraySize);
}