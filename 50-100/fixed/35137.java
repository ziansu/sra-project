public void insertHead(swingGUI.VideoTape tape) {
    swingGUI.DoubleNode node = new swingGUI.DoubleNode(tape);
    if ((head) == null) {
        head = node;
        tail = node;
        current = head;
        (count)++;
    }else {
        head.setPrev(node);
        node.setNext(head);
        head = node;
        current = head;
        (count)++;
    }
}