@java.lang.Override
public E get(int index) {
    org.tanc.algorithm.list.impl.LinkListImpl.Node<E> node = getNode(index);
    if (node == null) {
        return null;
    }
    return node.item;
}