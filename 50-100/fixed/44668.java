public void addLast(E data) {
    if ((last) == null) {
        first = last = new LLNode(data);
    }else {
        LLNode<E> temp = new LLNode(data);
        last.setNext(temp);
        last = temp;
    }
}