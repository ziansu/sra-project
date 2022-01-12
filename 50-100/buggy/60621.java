public java.util.List<net.adamjak.utils.trees.TreeNode<T>> getListOfLeafs() {
    java.util.List<net.adamjak.utils.trees.TreeNode<T>> leafs = new java.util.LinkedList<net.adamjak.utils.trees.TreeNode<T>>();
    for (net.adamjak.utils.trees.TreeNode<T> n : this.listOfNodes) {
        if (n.isNodeTypeLeaf()) {
            leafs.add(n);
        }
    }
    return leafs;
}