public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException("The input to nearest method is null!");
    
    if ((root) == null)
        return null;
    
    double closestDistanceSQ = root.p.distanceSquaredTo(p);
    edu.princeton.cs.algs4.Point2D closestPoint = root.p;
    KdTree.Node currentNode = root;
    nearest(p, currentNode, closestPoint, closestDistanceSQ);
    return closestPoint;
}