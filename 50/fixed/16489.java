@java.lang.Override
public boolean hasNext() {
    try {
        this.temp.peek();
    } catch (myUtils.BinaryHeap.HeapException ex) {
        return false;
    }
    return true;
}