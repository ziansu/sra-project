@java.lang.SuppressWarnings(value = "unchecked")
public E remove() {
    E item = ((E) (heap[0]));
    fixHeap(0);
    return item;
}