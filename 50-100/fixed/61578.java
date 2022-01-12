public java.lang.Object get(int index) {
    if ((index < 0) || (index > ((this.size) - 1))) {
        return null;
    }
    MyLinkedList.Node current = this.head;
    for (int i = 0; i < index; i++) {
        current = current.getNext();
    }
    return current.getData();
}