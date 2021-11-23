public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException("The input to nearest method is null!");
    
    if ((root) == null)
        return null;
    
    KdTree.Node currentNode = root;
    edu.princeton.cs.algs4.Point2D closestPoint = root.p;
    return nearest(p, currentNode, closestPoint);
}