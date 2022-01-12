model.Node findEnd() {
    model.Node currentNode = this;
    while ((currentNode.nextNode) != null) {
        currentNode = currentNode.nextNode;
    } 
    return currentNode;
}