public boolean containsKey(java.lang.String key) {
    int index = (key.hashCode()) % (this.valueTable.length);
    java.lang.String currentKey;
    while ((currentKey = this.keyTable[index]) != null) {
        if (key.equals(currentKey))
            return true;
        
        index = (index + 1) % (this.keyTable.length);
    } 
    return false;
}