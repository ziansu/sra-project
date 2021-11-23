public E get(int x) throws java.lang.IndexOutOfBoundsException {
    E found = null;
    int index = 0;
    LLNode<E> item = first;
    while ((item != null) && (index < x)) {
        index++;
        item = item.getNext();
    } 
    return item.getData();
}