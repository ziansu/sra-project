public RedBlackTree.Node TreeSuccessor(RedBlackTree.Node node) {
    if (node != null)
        return ceilingNode(((node.key) + 1));
    else
        return null;
    
}