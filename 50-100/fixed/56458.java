public void add(E data) {
    if (isEmpty()) {
        addFirst(data);
        return ;
    }
    LinkedList<E>.Node current = head;
    while ((current.next) != null) {
        current = current.next;
    } 
    LinkedList<E>.Node newNode = new Node(data);
    current.next = newNode;
    ++(size);
}