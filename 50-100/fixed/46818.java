private KdTree.Node put(KdTree.Node parent, KdTree.Node node, edu.princeton.cs.algs4.Point2D p) {
    if (node == null)
        return new KdTree.Node(parent, p);
    
    int cmp = KdTree.compare(p, node);
    if (cmp < 0)
        node.lb = put(node, node.lb, p);
    else
        if (cmp > 0)
            node.rt = put(node, node.rt, p);
        
    
    return node;
}