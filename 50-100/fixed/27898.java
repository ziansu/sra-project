public MinHeap<E> offer(E obj) {
    if ((this.size) >= (array.length)) {
        java.lang.System.err.println("Array index out of bound.");
        java.lang.System.exit(1);
    }
    array[((this.size)++)] = obj;
    percolateUp(((this.size) - 1));
    return this;
}