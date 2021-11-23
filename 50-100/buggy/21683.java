private linked_yarn.LinkedYarn.Node findFirstNodeWith(java.lang.String toFind) {
    if (this.isEmpty()) {
        return null;
    }
    linked_yarn.LinkedYarn.Node currentNode = this.head;
    while (currentNode != null) {
        if (currentNode.text.equals(toFind)) {
            return currentNode;
        }else {
            currentNode = currentNode.next;
        }
    } 
    return null;
}