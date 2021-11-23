public int remove() {
    int popped = heap[idv.carl.datastructures.heaptree.MinHeap.FRONT];
    heap[idv.carl.datastructures.heaptree.MinHeap.FRONT] = heap[((size)--)];
    minHeapify(idv.carl.datastructures.heaptree.MinHeap.FRONT);
    return popped;
}