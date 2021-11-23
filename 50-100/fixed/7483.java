public void computeSegments() {
    int maxX = (graph.dimX()) - 1;
    int maxY = (graph.dimY()) - 1;
    for (int currentY = maxY; currentY >= 0; currentY--) {
        currentWindow = sbr.Range.TwoDimensionalRange(0, maxX, currentY, maxY);
        computeSegmentsInRange();
        for (sbr.Segment seg : segments)
            assert !(seg.getLinks().isEmpty());
        
    }
}