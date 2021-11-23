public void insertAfter(int new_data, int position) {
    LinkedList.Node new_node = new LinkedList.Node(new_data);
    LinkedList.Node temp = head;
    for (int i = 1; (i < position) && (temp != null); i++) {
        temp = temp.next;
    }
    new_node.next = temp.next;
    temp.next = new_node;
}