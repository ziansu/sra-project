public void insert(int element) {
    this.Heap[(++(this.size))] = element;
    int current = this.size;
    while ((this.Heap[current]) < (this.Heap[this.parent(current)])) {
        this.swap(current, this.parent(current));
        current = this.parent(current);
    } 
}