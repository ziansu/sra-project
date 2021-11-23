private void percolateDown(MinHeap.HeapEntry<E> root) {
    if (root == null) {
        return ;
    }
    MinHeap.HeapEntry<E> minChild = findMinChild(root);
    if (minChild == null) {
        return ;
    }else
        if ((compareTo(minChild.obj, root.obj)) < 0) {
            switchPos(root, minChild);
            percolateDown(root);
        }
    
}