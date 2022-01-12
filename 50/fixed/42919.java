private boolean isPointWithinNodeRect(KdTree.Node n, Point2D p) {
    if (n == null)
        throw new java.lang.NullPointerException("Node null in isPointWithinNodeRect()");
    
    RectHV rect = n.getRect();
    return rect.contains(p);
}