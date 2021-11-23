private long estimateMem(int tailBPV) {
    long valuesAboveTailBPV = getHeadValueCount(tailBPV);
    int pointerBPV = (valuesAboveTailBPV == 0) ? 0 : org.apache.lucene.util.packed.PackedInts.bitsRequired((valuesAboveTailBPV - 1));
    if (tailBPV < pointerBPV) {
        return 0;
    }
    return ((valuesAboveTailBPV * (maxBPV)) + ((valueCount) * (tailBPV + 1))) / 8;
}