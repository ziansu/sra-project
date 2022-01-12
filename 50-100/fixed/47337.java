protected void rehash() {
    java.util.Set<java.util.Map.Entry<K, V>> old = this.entrySet();
    for (; ;) {
        this.generateHashFunctions(currentSize);
        java.util.Arrays.fill(this.entryStore[0], null);
        java.util.Arrays.fill(this.entryStore[1], null);
        if ((rehashHelper(old)) == null)
            break;
        
    }
}