private long estimateMem(int tailBPV) {
    long valuesAboveTailBPV = getHeadValueCount(tailBPV);
    int pointerBPV = org.apache.lucene.util.packed.PackedInts.bitsRequired(valuesAboveTailBPV);
    if (tailBPV < pointerBPV) {
        return 0;
    }
    return ((valuesAboveTailBPV * (maxBPV)) + ((valueCount) * (tailBPV + 1))) / 8;
}