private void doubleRotate(WAVLTree.WAVLNode node, java.lang.String firstDirection, java.lang.String secondDirection) {
    rotate(node.getChild(firstDirection), firstDirection);
    rotate(node, secondDirection);
}