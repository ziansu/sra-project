public void insert(T node) {
    nodes.add(heapSize, node);
    heapifyUp(heapSize);
    (heapSize)++;
}