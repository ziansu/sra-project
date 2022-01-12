private boolean nextLhs() {
    if (mOuterIterator.hasNext()) {
        final java.util.Map.Entry<D, java.util.Set<R>> entry = mOuterIterator.next();
        mLhs = entry.getKey();
        mRhsIterator = entry.getValue().iterator();
        return true;
    }
    return false;
}