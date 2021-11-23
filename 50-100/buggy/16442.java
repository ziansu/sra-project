public void insert(long data) {
    org.dzhou.research.algorithm.tree.BTree.Node node = new org.dzhou.research.algorithm.tree.BTree.Node(data);
    if ((root) == null) {
        root = node;
        return ;
    }
    org.dzhou.research.algorithm.tree.BTree.Node result = insert(node, root);
    if (result != null)
        root = result;
    
}