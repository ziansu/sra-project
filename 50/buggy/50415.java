public void add(int _val) {
    LRUCache.Node newNode = new LRUCache.Node(_val, null, null);
    LRUCache.Node oldPreTail = tail.prev;
    oldPreTail.next = newNode;
    tail.prev = newNode;
    newNode.prev = oldPreTail;
    newNode.next = tail;
}