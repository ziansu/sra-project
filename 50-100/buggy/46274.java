@java.lang.Override
public boolean shouldWait() {
    com.hazelcast.map.impl.mapstore.writebehind.WriteBehindQueue<com.hazelcast.map.impl.mapstore.writebehind.entry.DelayedEntry> writeBehindQueue = store.getWriteBehindQueue();
    int size = writeBehindQueue.size();
    if (size == 0) {
        return false;
    }
    com.hazelcast.map.impl.mapstore.writebehind.entry.DelayedEntry entry = writeBehindQueue.peek();
    long currentSequence = entry.getSequence();
    return ((entry != null) && (currentSequence <= (this.sequence))) && (((size + currentSequence) - 1) >= (this.sequence));
}