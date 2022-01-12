public static void left_rotate(RBTree.Node node) {
    RBTree.Node node_up = node.right;
    node.right = node_up.left;
    node.right.parent = node;
    if ((node.parent) == (RBTree.NIL))
        RBTree.root = node_up;
    else
        if (node == (node.parent.left))
            node.parent.left = node_up;
        else
            node.parent.right = node_up;
        
    
    node_up.parent = node.parent;
    node_up.left = node;
    node.parent = node_up;
}