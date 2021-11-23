private KdTree.Node put(KdTree.Node parent, KdTree.Node node, edu.princeton.cs.algs4.Point2D p, boolean orientX) {
    if (node == null)
        return new KdTree.Node(parent, p, orientX);
    
    int cmp = KdTree.compare(p, node.p, orientX);
    if (cmp < 0)
        node.lb = put(node, node.lb, p, (!orientX));
    else
        if (cmp > 0)
            node.rt = put(node, node.rt, p, (!orientX));
        
    
    return node;
}