@java.lang.Override
public Item next() {
    if ((currentNode) == null) {
        throw new java.util.NoSuchElementException();
    }
    Item item = currentNode.item;
    currentNode = currentNode.next;
    if (item == null) {
        item = currentNode.item;
        currentNode = currentNode.next;
    }
    return item;
}