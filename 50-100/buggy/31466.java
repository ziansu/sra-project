private void customInsert(long id, int internalSize, Block block) {
    if ((remove(id)) != null) {
        if ((block.blockOperation) == (CacheSim.OPERATION_READ)) {
            (totalHits)++;
            totalHitsSize += internalSize;
        }
    }
    put(id, internalSize);
    (totalAccesses)++;
    totalSize += internalSize;
}