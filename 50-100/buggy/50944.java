public void freeSegmentsAfterAppendPosition() {
    final int appendSegmentIndex = ((int) ((appendPosition) >>> (this.segmentSizeBits)));
    while ((segments.size()) > (appendSegmentIndex + 1)) {
        freeMemorySegments.add(segments.get(((segments.size()) - 1)));
        segments.remove(((segments.size()) - 1));
    } 
}