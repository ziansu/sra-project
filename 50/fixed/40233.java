private void deleteHead() {
    T lastChild = heap[size];
    heap[size] = null;
    (size)--;
    if ((size) != 0) {
        heap[1] = lastChild;
        sink();
    }
}