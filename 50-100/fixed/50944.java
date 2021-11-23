public void freeSegmentsAfterAppendPosition() {
    final int appendSegmentIndex = ((int) ((appendPosition) >>> (segmentSizeBits)));
    while ((segments.size()) > (appendSegmentIndex + 1)) {
        freeMemorySegments.add(segments.get(((segments.size()) - 1)));
        segments.remove(((segments.size()) - 1));
    } 
}