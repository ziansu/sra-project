@java.lang.Override
public T dequeue() {
    if (isEmpty()) {
        throw new com.nadeem.app.dsa.exception.CollectionEmptyException();
    }
    T maxElement = this.elements[0];
    int elementToRemove = (lastIndex)--;
    this.elements[0] = this.elements[elementToRemove];
    this.elements[elementToRemove] = null;
    if ((this.size()) > 1) {
        heapifyRemove(0);
    }
    return maxElement;
}