public void addHistory(int[][] toAdd) {
    bloomFilter.put(toAdd);
    elements += 1;
    if ((elements) > (CAP)) {
        bloomFilter = com.google.common.hash.BloomFilter.create(graphFunnel, CAP, fpp);
        elements = 0;
    }
}