@java.lang.Override
public java.lang.Object previous() {
    if (!(hasPrevious())) {
        throw new java.util.NoSuchElementException();
    }
    previousNode = currentNode;
    currentNode = previousNode.prev;
    (count)--;
    return previousNode.data;
}