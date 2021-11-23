public int height(algo.data.structures.BinaryNode<T> currentNode) {
    if (currentNode == null)
        return 0;
    
    int leftHeight = height(currentNode.getLeft());
    int rightHeight = height(currentNode.getRight());
    return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
}