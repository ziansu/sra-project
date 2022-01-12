public T get(int index) {
    if (index >= (size())) {
        throw new java.lang.IllegalArgumentException(((("ERROR: Cannot get " + index) + " element. List is of size ") + (size)));
    }
    com.eagulyi.interview.datastructures.MyLinkedList<T>.Node result = firstNode;
    while (index != 0) {
        result = result.next;
        index--;
    } 
    return result.data;
}