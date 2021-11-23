private linked_yarn.LinkedYarn.Node findFirstNodeWith(java.lang.String toFind) {
    if (isEmpty()) {
        return null;
    }
    linked_yarn.LinkedYarn.Node currentNode = this.head;
    while (currentNode != null) {
        if (currentNode.text.equals(toFind)) {
            return currentNode;
        }
        currentNode = currentNode.next;
    } 
    return null;
}