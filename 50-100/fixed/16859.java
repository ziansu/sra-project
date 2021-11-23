public Raft.LogEntry getEntry(long index) {
    long firstLogIndex = getFirstLogIndex();
    long lastLogIndex = getLastLogIndex();
    if (((index == 0) || (index < firstLogIndex)) || (index > lastLogIndex)) {
        com.github.wenweihu86.raft.storage.SegmentedLog.LOG.warn("index out of range, index={}, firstLogIndex={}, lastLogIndex={}", index, firstLogIndex, lastLogIndex);
        return null;
    }
    com.github.wenweihu86.raft.storage.Segment segment = startLogIndexSegmentMap.lowerEntry(index).getValue();
    return segment.getEntry(index);
}