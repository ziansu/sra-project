public void insertMemoryData(org.exbin.deltahex.delta.MemorySegment memorySegment, long position, byte[] insertedData) {
    org.exbin.deltahex.delta.MemoryDataSource memorySource = memorySegment.getSource();
    org.exbin.deltahex.delta.SegmentsRepository.DataSegmentsMap segmentsMap = memorySources.get(memorySource);
    detachMemoryArea(memorySegment, position, 0);
    shiftSegments(memorySegment, position, insertedData.length);
    memorySource.insert(position, insertedData);
    segmentsMap.updateSegmentLength(memorySegment, ((memorySegment.getLength()) + (insertedData.length)));
}