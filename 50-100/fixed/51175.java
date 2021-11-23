private void redBlackTransplant(RedBlackTree.RedBlackTreeNode nodeToReplace, RedBlackTree.RedBlackTreeNode nodeToReplaceWith) {
    if ((nodeToReplace.parent) == null) {
        rootNode = nodeToReplaceWith;
    }else
        if (nodeToReplace == (nodeToReplace.parent.leftChild)) {
            nodeToReplace.parent.leftChild = nodeToReplaceWith;
        }else {
            nodeToReplace.parent.rightChild = nodeToReplaceWith;
        }
    
    if (nodeToReplaceWith != null) {
        nodeToReplaceWith.parent = nodeToReplace.parent;
    }
}