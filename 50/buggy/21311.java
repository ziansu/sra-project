public T peekLast() {
    return ((ar.fiuba.tdd.template.Node<T>) (first.last())).getValue();
}