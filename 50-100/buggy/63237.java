public void insert(int value) {
    if (this.empty()) {
        this.minNode = new data_structures.BinomialHeap.HeapNode(value);
        this.roots.add(minNode);
    }else {
        data_structures.BinomialHeap heap = new data_structures.BinomialHeap();
        heap.insert(value);
        if ((this.minNode.value) > (heap.minNode.value)) {
            this.minNode = heap.minNode;
        }
        this.meld(heap);
    }
    (this.size)++;
}