public void add(LRUCache.Node newNode) {
    LRUCache.Node oldPreTail = tail.prev;
    oldPreTail.next = newNode;
    tail.prev = newNode;
    newNode.prev = oldPreTail;
    newNode.next = tail;
}