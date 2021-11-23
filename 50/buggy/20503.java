boolean containsAny(java.util.BitSet data) {
    java.util.BitSet copy = ((java.util.BitSet) (liveVars.clone()));
    copy.and(data);
    return copy.isEmpty();
}