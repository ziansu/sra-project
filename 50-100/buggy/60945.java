public int deleteMin() {
    int min = heap.get(0);
    heap.set(0, ((heap.size()) - 1));
    heap.remove(((heap.size()) - 1));
    percolateDown(0);
    return min;
}