public void addLast(E data) {
    if ((last) == null) {
        last = new LLNode(data);
    }else {
        LLNode<E> temp = new LLNode(data);
        temp.setNext(last);
        last = temp;
    }
}