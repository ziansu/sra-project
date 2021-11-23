@java.lang.Override
public boolean hasNext() {
    try {
        peek();
    } catch (myUtils.BinaryHeap.HeapException ex) {
        return false;
    }
    return true;
}