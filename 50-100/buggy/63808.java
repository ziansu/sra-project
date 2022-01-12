public void insertMemoryData(org.exbin.deltahex.delta.MemorySegment memorySegment, long position, byte[] insertedData, int insertedDataOffset, int insertedDataLength) {
    org.exbin.deltahex.delta.MemoryDataSource memorySource = memorySegment.getSource();
    org.exbin.deltahex.delta.SegmentsRepository.DataSegmentsMap segmentsMap = memorySources.get(memorySource);
    detachMemoryArea(memorySegment, position, 0);
    shiftSegments(memorySegment, position, insertedDataLength);
    memorySegment.getSource().insert(position, insertedData, insertedDataOffset, insertedDataLength);
    segmentsMap.updateSegmentLength(memorySegment, ((memorySegment.getLength()) + insertedDataLength));
}