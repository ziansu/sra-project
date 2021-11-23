public void add(E data) {
    LinkedList<E>.Node newNode = new Node(data);
    if (isEmpty()) {
        addFirst(data);
        return ;
    }
    LinkedList<E>.Node current = head;
    while ((current.next) != null) {
        current = current.next;
    } 
    current.next = newNode;
    ++(size);
}