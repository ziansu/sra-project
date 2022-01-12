public com.indago.pg.segments.ConflictSet getConflictSetFor(final com.indago.pg.segments.SegmentNode node) {
    final com.indago.pg.segments.ConflictSet cs = new com.indago.pg.segments.ConflictSet();
    for (final java.util.Collection<com.indago.data.segmentation.LabelingSegment> clique : conflictGraph.getConflictGraphCliques()) {
        if (clique.contains(node.getSegment())) {
            for (final com.indago.data.segmentation.LabelingSegment ls : clique) {
                cs.add(segmentBimap.getA(ls));
            }
            return cs;
        }
    }
    cs.add(node);
    return cs;
}