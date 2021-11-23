public void insert(E e) {
    this.entity = e;
    java.util.List<E> l = new java.util.ArrayList<>();
    l.add(e);
    this.insert(l);
}