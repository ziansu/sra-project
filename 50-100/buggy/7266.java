long exceptsPerCycle(int cycle) {
    net.openhft.chronicle.queue.impl.single.SingleChronicleQueueExcerpts.StoreTailer tailer = acquireTailer();
    try {
        long index = rollCycle.toIndex(cycle, 0);
        if (tailer.moveToIndex(index)) {
            assert (tailer.store.refCount()) > 1;
            return (tailer.store.lastSequenceNumber(tailer)) + 1;
        }else {
            return -1;
        }
    } catch (java.io.StreamCorruptedException e) {
        throw new java.lang.IllegalStateException(e);
    } finally {
        tailer.release();
    }
}