public boolean add(T value) {
    if ((size) == 0) {
        start = new LNode(value);
        end = start;
    }else {
        end.setNext(new LNode(value));
        end = end.getNext();
    }
    (size)++;
    return true;
}