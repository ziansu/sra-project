public void removeHead() {
    head = head.getNext();
    current = head;
    head.getPrev().setNext(null);
    head.setPrev(null);
}