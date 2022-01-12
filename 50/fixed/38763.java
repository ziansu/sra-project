public T pop() throws dev.structure.exceptions.EmptyStackException {
    T toReturn = head.getData();
    if (toReturn == null) {
        throwEmptyStackException();
    }
    head = head.getNext();
    return toReturn;
}