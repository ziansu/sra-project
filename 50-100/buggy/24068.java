private dushyant.lib.datastructures.AVLTree<T>.Node caseLeaf(dushyant.lib.datastructures.AVLTree<T>.Node node) {
    dushyant.lib.datastructures.AVLTree<T>.Node parent = node.parent;
    if (parent == null) {
        root = null;
    }else {
        if ((node.data.compareTo(parent.data)) > 0)
            parent.right = null;
        else
            parent.left = null;
        
    }
    return parent;
}