public T getFromZeroBasedIdx(final int idx) {
    if (((this.timeSeries) != null) && ((this.currentNowIdx) != (-1))) {
        return null;
    }else {
        validateIdx(idx);
        return get(idx(((currentNowIdx) + idx)));
    }
}