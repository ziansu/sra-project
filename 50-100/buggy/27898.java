public MinHeap<E> offer(E obj) {
    if ((size) >= (array.length)) {
        java.lang.System.err.println("Array index out of bound.");
        java.lang.System.exit(1);
    }
    array[((size)++)] = obj;
    percolateUp(((size) - 1));
    return this;
}