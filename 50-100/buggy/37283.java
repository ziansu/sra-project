protected long getFileSizeFor(final me.noize.chemistry.io.TimeRange timeRange) {
    int rowSize = (this.getValueType().getSizeOfType()) + 1;
    long numberOfEntries = (timeRange.getDuration()) / (this.getQuantization());
    return rowSize * numberOfEntries;
}