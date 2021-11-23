public T getFromZeroBasedIdx(final int idx) {
    if (((this.timeSeries) != null) && ((this.currentNowIdx) != (-1))) {
        validateIdx(idx);
        return get(idx(((currentNowIdx) + idx)));
    }else {
        return null;
    }
}