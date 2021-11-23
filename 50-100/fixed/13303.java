public void build() {
    this.size = this.heap.length;
    for (int i = ((this.size()) - 1) / 2; i > (-1); i--) {
        this.heapify(i);
    }
}