private boolean findNextSegmentForNode() {
    while ((((currentSegmentIterator) == null) || (!(currentSegmentIterator.hasNext()))) && ((currentSegmentId) < (liveSegmentId))) {
        currentSegmentIterator = segmentEdgeAccessor.getNodeEdges((++(currentSegmentId)), node);
    } 
    return ((currentSegmentIterator) != null) && (currentSegmentIterator.hasNext());
}