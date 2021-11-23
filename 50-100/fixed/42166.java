private void preprocessBisectingPairs(geometry.proofs.Diagram diagram, geometry.proofs.FigureRelation pair) {
    geometry.shapes.Segment seg1 = pair.getFigure1();
    geometry.Vec2 midptLoc = seg1.getCenter(true);
    geometry.shapes.Vertex midpt = getVertexAtLoc(diagram, midptLoc);
    if (midpt == null)
        throw new java.lang.NullPointerException("No vertex at midpoint");
    
    diagram.removeFigureRelationPair(pair);
    geometry.shapes.Segment bisectedSeg = pair.getFigure1();
    diagram.addFigureRelationPair(FigureRelationType.MIDPOINT, midpt.getName(), bisectedSeg.getName(), pair);
}