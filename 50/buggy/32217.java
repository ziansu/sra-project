public void insert(edu.princeton.cs.algs4.Point2D p) {
    if (!(searchtrees.kdtrees.KdTree.BOUNDARY.contains(p))) {
        throw new java.lang.IllegalArgumentException("Only points in unit square are allowed");
    }
    root = insert(root, p, true);
}