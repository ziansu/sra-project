public int getHeight(T val) {
    generic.BinTreeNode<T> node = getNode(val);
    if (new NullNode().isNull(node))
        throw new generic.AvlTree.NotInTreeException("value requested is not in tree and cannot be replaced");
    
    return node.getHeight();
}