private void removeNodeFromRootList(FibonacciHeap.HeapNode node) {
    if ((node.next) == node) {
        this.min = null;
    }else {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}