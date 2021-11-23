private KdTree.Node getNode(edu.princeton.cs.algs4.Point2D p) {
    boolean matchedPrevious = false;
    return getNode(root, p, 0, matchedPrevious);
}