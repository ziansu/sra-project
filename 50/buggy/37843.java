public int findFreeFrequency(java.lang.String channel) {
    java.util.BitSet set = usedTeleports.get(channel);
    if (set == null) {
        return -1;
    }
    return set.nextClearBit(0);
}