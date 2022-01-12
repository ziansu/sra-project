public T heapify() {
    if ((this.numberOfElements) == 0)
        return null;
    
    T root = heap[0];
    (this.numberOfElements)--;
    heap[0] = heap[this.numberOfElements];
    heap[this.numberOfElements] = null;
    bubbleDown(0);
    return root;
}