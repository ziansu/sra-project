private SinglyLinkedList<Item>.Node node(int index) {
    SinglyLinkedList<Item>.Node x = first;
    for (int i = 0; i < index; i++)
        x = x.next;
    
    return x;
}