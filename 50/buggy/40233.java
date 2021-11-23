private void deleteHead() {
    T lastChild = heap[size];
    heap[size] = null;
    heap[1] = lastChild;
    sink();
    (size)--;
}