public Node deleteNode() {
    Node currentHead = head;
    head = currentHead.getNext();
    (nodeCounter)--;
    return currentHead;
}