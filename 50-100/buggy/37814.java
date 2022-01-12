private void combineConvexHulls(allnearestneighbours.VoronoiDiagram left, allnearestneighbours.VoronoiDiagram right, allnearestneighbours.VoronoiPoint upperSupportLeft, allnearestneighbours.VoronoiPoint upperSupportRight, allnearestneighbours.VoronoiPoint lowerSupportLeft, allnearestneighbours.VoronoiPoint lowerSupportRight) {
    if ((left.convexHull.size()) != 1)
        left.convexHull.retainSegment(lowerSupportLeft, upperSupportLeft);
    
    if ((right.convexHull.size()) != 1)
        right.convexHull.retainSegment(lowerSupportRight, upperSupportRight);
    
    convexHull = avltree.AVLTree.join(left.convexHull, right.convexHull);
    convexHull.setComparator(new avltree.ComparableComparator(convexHull.get(0), convexHull.get(1)));
}