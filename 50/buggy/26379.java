void updateReplicationState(long timestamp, byte identifier) {
    net.openhft.chronicle.map.impl.stage.entry.ReplicatedMapEntryStages.initDelayedUpdateChecksum(true);
    net.openhft.chronicle.bytes.Bytes segmentBytes = s.segmentBytesForWrite();
    segmentBytes.writePosition(replicationBytesOffset);
    segmentBytes.writeLong(timestamp);
    segmentBytes.writeByte(identifier);
}