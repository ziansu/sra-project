private com.jwetherell.algorithms.data_structures.BTree.Node<T> getGreatestNode(com.jwetherell.algorithms.data_structures.BTree.Node<T> nodeToGet) {
    com.jwetherell.algorithms.data_structures.BTree.Node<T> node = nodeToGet;
    while ((node.numberOfChildren()) > 0) {
        node = node.getChild(((node.numberOfChildren()) - 1));
    } 
    return node;
}