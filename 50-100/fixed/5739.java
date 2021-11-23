public void addHistory(int[][] toAdd) {
    if ((elements) >= (CAP)) {
        bloomFilter = com.google.common.hash.BloomFilter.create(graphFunnel, CAP, fpp);
        elements = 0;
    }
    bloomFilter.put(toAdd);
    elements += 1;
}