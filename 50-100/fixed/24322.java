public void insertMemoryData(org.exbin.deltahex.delta.MemorySegment memorySegment, long position, org.exbin.utils.binary_data.BinaryData insertedData, long insertedDataOffset, long insertedDataLength) {
    org.exbin.deltahex.delta.MemoryDataSource memorySource = memorySegment.getSource();
    org.exbin.deltahex.delta.SegmentsRepository.DataSegmentsMap segmentsMap = memorySources.get(memorySource);
    detachMemoryArea(memorySegment, position, 0);
    shiftSegments(memorySegment, position, insertedDataLength);
    memorySource.insert(position, insertedData, insertedDataOffset, insertedDataLength);
    segmentsMap.updateSegmentLength(memorySegment, ((memorySegment.getLength()) + insertedDataLength));
}