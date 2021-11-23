@java.lang.Override
public void write() {
    try {
        if (isNeedFlush()) {
            flush();
        }
        T data = queue.poll(100, java.util.concurrent.TimeUnit.MICROSECONDS);
        page.put(data);
        com.concurrent.sdk.transfer.ConcurrentWriteTransfer.logger.debug("memoryPage put data|{}, page size|{}", data, page.size());
    } catch (java.lang.InterruptedException e) {
        com.concurrent.sdk.transfer.ConcurrentWriteTransfer.logger.error("queue poll data error", e);
    }
}