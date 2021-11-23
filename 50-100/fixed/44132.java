@java.lang.Override
public void addLast(final E e) {
    if ((last) == null) {
        first = last = new LinkedList.Node<>(e, null, null);
        (size)++;
        return ;
    }
    if ((last.next) != null) {
        addMiddle(last, e);
        return ;
    }
    final LinkedList.Node<E> newLast = new LinkedList.Node<>(e, last, null);
    last.next = newLast;
    last = newLast;
    (size)++;
}