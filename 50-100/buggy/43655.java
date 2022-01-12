@java.lang.Override
public boolean advance() throws java.io.IOException {
    current = scanIterator.next(scanner);
    rowsRead.addAndGet(scanIterator.getRowCount(current));
    boolean isComplete = !(scanIterator.isCompletionMarker(current));
    if (!isComplete) {
        rangeTracker.tryReturnRecordAt(true, com.google.cloud.dataflow.sdk.io.range.ByteKey.of(scanIterator.getLatestKey(current)));
    }
    return isComplete;
}