private java.lang.String writeTranslate(com.metamx.common.Pair<java.lang.Integer, com.google.common.collect.PeekingIterator<java.lang.String>> smallest, int counter) {
    final int index = smallest.lhs;
    final java.lang.String value = smallest.rhs.next();
    conversions[index][indexers[index]] = counter;
    indexers[index] += 1;
    if (smallest.rhs.hasNext()) {
        pQueue.add(smallest);
    }
    return value;
}