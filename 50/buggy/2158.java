public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    if (p == null) {
        throw new java.lang.NullPointerException();
    }
    if ((root) == null)
        return null;
    else
        return nearest(root, p, root.p, true);
    
}