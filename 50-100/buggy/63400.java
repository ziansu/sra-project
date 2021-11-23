public synchronized K removeRoot() {
    if (heap.isEmpty())
        throw new java.lang.RuntimeException("Heap is empty! Cannot remove anything.");
    
    K root = heap.get(0);
    (maxIndex)--;
    K lastLeaf = heap.remove(maxIndex);
    heap.set(0, lastLeaf);
    bubbleDown(0);
    return root;
}