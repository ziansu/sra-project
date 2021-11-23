@java.lang.Override
public java.util.Iterator<E> iterator() {
    return new QueueIterator<>(head, tail);
}