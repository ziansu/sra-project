public long get(java.lang.String key) {
    int index = (java.lang.Math.abs(key.hashCode())) % (this.valueTable.length);
    java.lang.String currentKey;
    while ((currentKey = this.keyTable[index]) != null) {
        if (key.equals(currentKey))
            return this.valueTable[index];
        
        index = (index + 1) % (this.keyTable.length);
    } 
    return org.formulachess.util.HashtableOfLong.NO_VALUE;
}