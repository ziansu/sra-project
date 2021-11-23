private boolean add(T value) {
    try {
        if ((size) == 0) {
            start = new LNode(value);
            end = start;
        }else {
            end.setNext(new LNode(value));
            end = end.getNext();
        }
        (size)++;
        return true;
    } catch (java.lang.IndexOutOfBoundsException e) {
        java.lang.System.out.println("Index out of bound");
    }
}