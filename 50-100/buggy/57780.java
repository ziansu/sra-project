private void percolateUp(MinHeap.HeapEntry<E> node) {
    if (node == null) {
        return ;
    }
    MinHeap.HeapEntry<E> parent = getParent(node);
    if ((parent == null) || ((compareTo(parent.obj, node.obj)) <= 0)) {
        return ;
    }
    switchPos(parent, node);
    percolateUp(parent);
}