private T dequeue() {
    if ((elements.size()) == 0) {
        return null;
    }
    T smallest = elements.remove(0);
    java.util.ListIterator<T> iterator = elements.listIterator();
    while (iterator.hasNext()) {
        T next = iterator.next();
        if ((comparator.compare(smallest, next)) > 0) {
            iterator.set(smallest);
            smallest = next;
        }
    } 
    return smallest;
}