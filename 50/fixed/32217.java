public void insert(edu.princeton.cs.algs4.Point2D p) {
    assert searchtrees.kdtrees.KdTree.BOUNDARY.contains(p);
    root = insert(root, p, true);
}