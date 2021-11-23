static void insert(linkedlist.Node head, linkedlist.Node newNode, int index) {
    linkedlist.Node current = head;
    for (int i = 0; i < (index + 1); i++) {
        if (i == (index - 1)) {
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            break;
        }else {
            if (current != null) {
                current = current.getNext();
            }
        }
    }
}