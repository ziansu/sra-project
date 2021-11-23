public boolean contains(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException("point should not be null");
    
    return contains(p, root, true);
}