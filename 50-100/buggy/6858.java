public boolean contains(java.lang.String key) {
    int[] hashes = getHashes(key);
    for (int hash : hashes) {
        if (store.getBit((hash % (capacity)))) {
            return true;
        }
    }
    return false;
}