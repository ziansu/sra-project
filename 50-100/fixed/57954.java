public T pop_front() {
    T headDataValue = null;
    if ((numberOfItems) > 0) {
        headDataValue = head.getValue();
        Queue<T>.Node<T> oldHead = head;
        head = head.getNext();
        oldHead.setNext(null);
        oldHead.setPrevious(null);
        (numberOfItems)--;
    }
    return headDataValue;
}