public void insert(int value) {
    if (this.empty()) {
        this.minNode = new data_structures.BinomialHeap.HeapNode(value);
        this.roots.add(minNode);
        this.size = 1;
    }else {
        data_structures.BinomialHeap heap = new data_structures.BinomialHeap();
        heap.insert(value);
        this.meld(heap);
    }
}