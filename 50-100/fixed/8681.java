public boolean get(long i) {
    int entry = ((int) (i / (edu.umn.cs.spatialHadoop.util.BitArray.BitsPerEntry)));
    int offset = ((int) (i % (edu.umn.cs.spatialHadoop.util.BitArray.BitsPerEntry)));
    return ((entries[entry]) & (1L << offset)) != 0;
}