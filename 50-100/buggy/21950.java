public void addSegment(i5.las2peer.services.codeGenerationService.traces.segments.Segment segment) {
    this.segmentList.add(segment);
    if (!(this.hasSegment(segment.getId()))) {
        this.segmentMap.put(segment.getId(), segment);
    }
}