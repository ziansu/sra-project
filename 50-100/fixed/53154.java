public T get(int index) {
    lock.lock();
    LinkedList.Node<T> found = head;
    for (int i = 0; i < (size()); i++) {
        if (found == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        found = found.next;
    }
    T data = found.data;
    lock.unlock();
    return data;
}