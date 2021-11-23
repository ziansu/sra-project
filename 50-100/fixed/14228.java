public void insertMemoryData(org.exbin.deltahex.delta.MemorySegment memorySegment, long position, org.exbin.utils.binary_data.BinaryData insertedData) {
    org.exbin.deltahex.delta.MemoryDataSource memorySource = memorySegment.getSource();
    org.exbin.deltahex.delta.SegmentsRepository.DataSegmentsMap segmentsMap = memorySources.get(memorySource);
    detachMemoryArea(memorySegment, position, 0);
    shiftSegments(memorySegment, position, insertedData.getDataSize());
    memorySource.insert(position, insertedData);
    segmentsMap.updateSegmentLength(memorySegment, ((memorySegment.getLength()) + (insertedData.getDataSize())));
}