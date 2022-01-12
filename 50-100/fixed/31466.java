private void customInsert(long id, int internalSize, Block block, Block[] b) {
    if ((remove(id)) != null) {
        (totalHits)++;
        totalHitsSize += internalSize;
    }
    put(id, internalSize);
    (totalAccesses)++;
    totalSize += internalSize;
}