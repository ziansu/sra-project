@java.lang.Override
public co.cask.cdap.data2.queue.DequeueResult<byte[]> dequeue(int maxBatchSize) throws java.io.IOException {
    co.cask.cdap.data2.queue.DequeueResult<byte[]> result = performDequeue(maxBatchSize);
    if ((scanStartRow) != null) {
        if (!(consumingEntries.isEmpty())) {
            byte[] floorKey = consumingEntries.floorKey(scanStartRow);
            if (floorKey != null) {
                updateStartRow(floorKey);
            }
        }else {
            updateStartRow(scanStartRow);
        }
    }
    return result;
}