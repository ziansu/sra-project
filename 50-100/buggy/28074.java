public void insertAfter(E data) {
    data_structures.singly_linked_list.Node<E> currentNode = new data_structures.singly_linked_list.Node(data);
    if ((head) == null) {
        head = new data_structures.singly_linked_list.Node(data);
        (size)++;
    }else {
        while ((currentNode.next) != null) {
            currentNode = currentNode.next;
        } 
        currentNode.next = new data_structures.singly_linked_list.Node(data);
        (size)++;
    }
}