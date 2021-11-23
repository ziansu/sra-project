public boolean removePair(D domainElem, R rangeElem) {
    final boolean result;
    java.util.Set<R> rangeElems = mMap.get(domainElem);
    if (rangeElems == null) {
        result = false;
    }else {
        result = rangeElems.remove(rangeElem);
        if (rangeElems.isEmpty()) {
            mMap.remove(domainElem);
        }
    }
    return result;
}