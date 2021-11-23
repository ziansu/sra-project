private boolean contains(KdTree.Node node, edu.princeton.cs.algs4.Point2D p, boolean orientX) {
    if (node == null)
        return false;
    
    int cmp = KdTree.compare(p, node.p, orientX);
    if (cmp < 0)
        return contains(node.lb, p, (!orientX));
    else
        if (cmp > 0)
            return contains(node.rt, p, (!orientX));
        else
            return node.p.equals(p);
        
    
}