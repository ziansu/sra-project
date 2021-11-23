public E removeLast() {
    ArrayDeque<E>.DequeNode tail = currentTail;
    if ((currentTail) != null) {
        ArrayDeque<E>.DequeNode prevNode = currentTail.getPrev();
        if (prevNode != null) {
            prevNode.setNext(null);
        }
        currentTail = currentTail.prev;
        if ((size) == 1) {
            currentHead = null;
        }
        (size)--;
    }
    return tail;
}