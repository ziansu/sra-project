private java.util.Set<java.lang.Float> getEffectSet(java.util.Set<java.lang.Float> oneFreqSet, java.util.Set<java.lang.Float> causationSet) {
    java.util.Set<java.lang.Float> newOneFreqSet = new java.util.HashSet<java.lang.Float>(oneFreqSet);
    newOneFreqSet.removeAll(causationSet);
    return oneFreqSet;
}