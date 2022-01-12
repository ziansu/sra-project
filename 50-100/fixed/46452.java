private void randomInsertion_HYBRID_WITH_INNER_HYBRID_MAP() {
    for (int i = insertionStratIndex; i < (insertionEndIndex); i++) {
        java.lang.Integer randomKey = nextHotOrColdKeyOuterMap(i);
        hybrid_ds.HybridIntMap<java.lang.Integer> newMap = new hybrid_ds.HybridIntMap<java.lang.Integer>(casTries);
        hybrid_ds.HybridIntMap<java.lang.Integer> innerMap = outerHybridIntMapInnrMap.putIfAbsent(randomKey, newMap);
        if (innerMap == null) {
            innerMap = newMap;
        }
        java.lang.Integer innerKey = nextInnerMapKeyValue();
        java.lang.Integer innerValue = innerKey;
        innerMap.put(innerKey, innerValue);
    }
}