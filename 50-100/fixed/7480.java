@java.lang.Override
public co.cask.cdap.data2.queue.DequeueResult<byte[]> dequeue(int maxBatchSize) throws java.io.IOException {
    co.cask.cdap.data2.queue.DequeueResult<byte[]> result = performDequeue(maxBatchSize);
    byte[] floorKey = consumingEntries.floorKey(scanStartRow);
    updateStartRow((floorKey == null ? scanStartRow : floorKey));
    return result;
}