@java.lang.Override
public Item removeLast() {
    LinkedListDeque<Item>.Node lastNode = getLastNode();
    lastNode.previous.next = sentinel;
    sentinel.previous = lastNode.previous;
    return lastNode.item;
}