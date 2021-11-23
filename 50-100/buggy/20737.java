public T heapify() {
    if ((this.numberOfElements) == 0)
        return null;
    
    T root = heap[0];
    (this.numberOfElements)--;
    T t = heap[this.numberOfElements];
    bubbleDown(t, 0);
    return root;
}