@java.lang.Override
public void insertLast(E e) {
    Node<E> x = new Node(e);
    x.setAfter(trailer);
    x.setBefore(trailer.getBefore());
    trailer.getBefore().setAfter(x);
    trailer.setBefore(x);
    (size)++;
}