@java.lang.Override
public Item removeLast() {
    size -= 1;
    LinkedListDeque<Item>.Node lastNode = getLastNode();
    lastNode.previous.next = sentinel;
    sentinel.previous = lastNode.previous;
    return lastNode.item;
}