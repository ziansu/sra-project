public void checkDeletion() {
    if ((currNode) != null) {
        if (new java.awt.Rectangle(currNode.getX(), currNode.getY(), currNode.getDiameter(), currNode.getDiameter()).intersects(deleteNode)) {
            Panel.nodes.remove(currNode);
        }
    }
}