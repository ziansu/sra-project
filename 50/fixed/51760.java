private void removeNodeFromRootList(FibonacciHeap.HeapNode node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
}