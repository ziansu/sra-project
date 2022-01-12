private <STATE> java.util.BitSet rewriteBitSet(final java.util.BitSet bs, final java.util.ArrayList<STATE> oldStateList, final java.util.Map<STATE, java.lang.Integer> newStateToIndex) {
    final java.util.BitSet newBs = new java.util.BitSet();
    int setBit = bs.nextSetBit(0);
    while (setBit != (-1)) {
        newBs.set(newStateToIndex.get(oldStateList.get(setBit)));
        setBit = bs.nextSetBit((setBit + 1));
    } 
    return newBs;
}