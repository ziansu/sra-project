public asciigame.utility.Node getNextNode() {
    if (((node) == null) || ((node.getParent()) == null)) {
        return null;
    }
    while ((node.getParent().getParent()) != null) {
        node = node.getParent();
    } 
    return node;
}