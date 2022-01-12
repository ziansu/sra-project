public Point2D findnearest(Point2D p) {
    if ((size()) == 0)
        return null;
    
    return nearest(root, p, true, root.p);
}