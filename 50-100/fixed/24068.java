private dushyant.lib.datastructures.AVLTree<T>.Node caseLeaf(dushyant.lib.datastructures.AVLTree<T>.Node node) {
    dushyant.lib.datastructures.AVLTree<T>.Node parent = node.parent;
    if (parent == null) {
        root = null;
    }else {
        if (node == (parent.right))
            parent.right = null;
        else
            parent.left = null;
        
    }
    return parent;
}