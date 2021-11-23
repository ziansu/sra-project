public boolean move(final E e, final double sx, final double sy, final double fx, final double fy) {
    return org.danilopianini.lang.FlexibleQuadTree.moveFromNode(root, e, sx, sy, fx, fy);
}