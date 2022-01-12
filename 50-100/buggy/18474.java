private void percolateDown(MinHeap.HeapEntry<E> root) {
    if (root == null) {
        return ;
    }
    MinHeap.HeapEntry<E> minChild = findMinChild(root);
    if (minChild == null) {
        return ;
    }
    switchPos(root, minChild);
    percolateDown(minChild);
}