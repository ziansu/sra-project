public T get(int index) {
    if ((index >= (size)) || (index < 0)) {
        return null;
    }
    LinkedListDeque.Item current = sentinel.next;
    T result = null;
    while (index >= 0) {
        result = ((T) (current.value));
        current = current.next;
        index -= 1;
    } 
    return result;
}