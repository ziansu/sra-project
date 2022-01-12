private pl.sdacaemy.data.structures.impl.ForwardList.Node getItemNode(int index) throws java.lang.IndexOutOfBoundsException {
    if (index == 0) {
        if ((head) == null) {
            throw new java.lang.IndexOutOfBoundsException(("Sorry no such element: " + index));
        }
        return head;
    }
    int currentIndex = 0;
    pl.sdacaemy.data.structures.impl.ForwardList.Node currentNode = head;
    while (((currentNode.next) != null) && (currentIndex < index)) {
        ++currentIndex;
        currentNode = currentNode.next;
    } 
    if (currentNode == null) {
        throw new java.lang.IndexOutOfBoundsException(("Sorry no such element: " + index));
    }
    return currentNode;
}