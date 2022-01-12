public void buildHeap() {
    this.size = this.heap.length;
    for (int i = ((this.size()) / 2) + 1; i > (-1); i--) {
        this.heapify(i);
    }
}