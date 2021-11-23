public Node deleteNode() {
    Node currentHead = new Node();
    currentHead = head;
    head = currentHead.getNext();
    (nodeCounter)--;
    return currentHead;
}