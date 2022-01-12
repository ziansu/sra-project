private void addNodeToRootLists(FibonacciHeap.HeapNode node) {
    if ((this.min) == null) {
        this.min = node;
    }else {
        node.prev = this.min.prev;
        this.min.prev.next = node;
        this.min.prev = node;
        node.next = this.min;
    }
}