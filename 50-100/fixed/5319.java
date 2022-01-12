private void randomInsertion_PURE_WITH_INNER_PURE_MAP() {
    java.lang.Integer randomKey;
    for (int i = insertionStratIndex; i < (insertionEndIndex); i++) {
        randomKey = nextHotOrColdKeyOuterMap(i);
        hybrid_ds.PureIntMap<java.lang.Integer> newMap = new hybrid_ds.PureIntMap<java.lang.Integer>();
        hybrid_ds.PureIntMap<java.lang.Integer> innerMap = outerPureIntMap.putIfAbsent(randomKey, newMap);
        if (innerMap == null) {
            innerMap = newMap;
        }
        java.lang.Integer innerKey = nextInnerMapKeyValue(i);
        java.lang.Integer innerValue = innerKey;
        innerMap.put(innerKey, innerValue);
    }
}