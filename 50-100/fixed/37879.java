private void selectVictim(int bucketStart) {
    byte victimOffset = ((byte) (rnd.nextInt(64)));
    int victimChain = com.github.benmanes.caffeine.cache.simulator.admission.tinyCache.TinySetIndexing.getChainAtOffset(hashFunc.fpaux, chainIndex, isLast, victimOffset);
    if (com.github.benmanes.caffeine.cache.simulator.admission.tinyCache.TinySetIndexing.chainExist(chainIndex[hashFunc.fpaux.set], victimChain))
        replace(hashFunc.fpaux, ((byte) (victimChain)), bucketStart, victimOffset);
    else {
        throw new java.lang.RuntimeException("Failed to replace");
    }
}