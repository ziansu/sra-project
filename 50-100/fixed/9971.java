public void addFirstNode(int data) {
    if ((size) == 0) {
        head = new a3.LinkedList.Node(data);
        head.next = tail;
        tail = head;
    }else {
        a3.LinkedList.Node newNode = new a3.LinkedList.Node(data);
        newNode.next = head;
        head = newNode;
    }
    ++(size);
}