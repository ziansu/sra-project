@java.lang.Override
public T next() {
    T next = current.getValue();
    current = current.getNext();
    return next;
}