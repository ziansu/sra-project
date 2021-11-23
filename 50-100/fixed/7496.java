private boolean contains(KdTree.Node node, edu.princeton.cs.algs4.Point2D p) {
    if (node == null)
        return false;
    
    int cmp = KdTree.compare(p, node);
    if (cmp < 0)
        return contains(node.lb, p);
    else
        if (cmp > 0)
            return contains(node.rt, p);
        else
            return node.p.equals(p);
        
    
}