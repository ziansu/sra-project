public boolean remove(int index, java.lang.Object key) {
    int frequency = keyfrequency(key);
    if ((index < 0) || (index > frequency))
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("Index: %s, frequency: %s", index, frequency));
    
    if (this.contains(key)) {
        this.remove(index, key);
        return true;
    }
    return false;
}