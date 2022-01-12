public T get(int index) {
    if ((index >= (size())) || (index < 0)) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    current = first;
    int i = 0;
    while (i < index) {
        current = node.getNext();
        i++;
    } 
    return current.getData();
}