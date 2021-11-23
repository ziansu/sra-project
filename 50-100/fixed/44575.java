public boolean remove(int index, K key) {
    int frequency = this.subMap.keyfrequency(key);
    if ((index < 0) || (index > frequency))
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("Index: %s, frequency: %s", index, frequency));
    
    if (this.contains(key)) {
        this.subMap.remove(index, key);
        return true;
    }
    return false;
}