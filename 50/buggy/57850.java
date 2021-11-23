public void push(int new_data) {
    LinkedList.Node new_node = new LinkedList.Node(new_data);
    new_node.next = head;
    head = new_node;
}