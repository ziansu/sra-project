protected void rehash() {
    java.util.Map.Entry<K, V>[] old = this.entrySet().toArray(new java.util.Map.Entry[0]);
    for (; ;) {
        this.generateHashFunctions(currentSize);
        java.util.Arrays.fill(this.entryStore[0], null);
        java.util.Arrays.fill(this.entryStore[1], null);
        if ((rehashHelper(old)) == null)
            break;
        
    }
}