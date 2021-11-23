@java.lang.Override
public Item removeFirst() {
    size -= 1;
    LinkedListDeque<Item>.Node firstNode = sentinel.next;
    sentinel.next = firstNode.next;
    firstNode.previous = sentinel;
    return firstNode.item;
}