public boolean contains(edu.princeton.cs.algs4.Point2D p) {
    if (p == null) {
        throw new java.lang.NullPointerException("contains(): p should not be null");
    }
    return (this.lookup(p)) != null;
}