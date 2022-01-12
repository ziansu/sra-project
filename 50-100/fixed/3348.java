public long getDoneCount() {
    if (((currentRange) == null) || ((ranges) == null)) {
        return 0;
    }
    long doneCount = 0;
    for (com.object0r.TorRange.datatypes.EntriesRange range : ranges) {
        if (isRangeDone(range)) {
            doneCount += range.getSize();
        }
    }
    if (!(isRangeDone(currentRange))) {
        doneCount += (currentEntry) - (currentRange.getStart());
    }
    return doneCount;
}