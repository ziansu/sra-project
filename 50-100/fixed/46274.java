@java.lang.Override
public boolean shouldWait() {
    com.hazelcast.map.impl.mapstore.writebehind.WriteBehindQueue<com.hazelcast.map.impl.mapstore.writebehind.entry.DelayedEntry> writeBehindQueue = store.getWriteBehindQueue();
    com.hazelcast.map.impl.mapstore.writebehind.entry.DelayedEntry entry = writeBehindQueue.peek();
    if (entry == null) {
        return false;
    }
    long currentSequence = entry.getSequence();
    return (currentSequence <= (this.sequence)) && ((((writeBehindQueue.size()) + currentSequence) - 1) >= (this.sequence));
}