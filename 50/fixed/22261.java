private WAVLTree.WAVLNode doubleRotateLeftRight(WAVLTree.WAVLNode node) {
    node.leftNode = rotateLeft(node.leftNode);
    return rotateRight(node);
}