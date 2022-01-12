public idv.carl.datastructures.list.DoubleLinkedNode removeHead() {
    if (isEmpty()) {
        return null;
    }
    idv.carl.datastructures.list.DoubleLinkedNode removed = head;
    if ((head.getNext()) == null) {
        tail = null;
    }else {
        head.getNext().setPrevious(null);
        head = head.getNext();
    }
    (size)--;
    return removed;
}