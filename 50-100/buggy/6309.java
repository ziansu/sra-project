public com.company.Vertex deleteMin() {
    com.company.Vertex min = this.heap[0];
    this.heap[0] = this.heap[this.size];
    this.size = (this.size) - 1;
    this.minHeapify(this.heap, this.heap[0], 0);
    return min;
}