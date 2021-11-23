@java.lang.Override
public E set(final int index, final E element) {
    checkIndex(index);
    final LinkedList.Node<E> node = getNode(index);
    final E removed = node.value;
    node.value = element;
    return removed;
}