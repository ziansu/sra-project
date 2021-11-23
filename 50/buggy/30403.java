public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException();
    
    if ((size()) == 0)
        return null;
    
    return nearest(p, root, true);
}