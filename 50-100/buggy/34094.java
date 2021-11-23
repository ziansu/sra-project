public void insertTail(swingGUI.VideoTape tape) {
    swingGUI.DoubleNode node = new swingGUI.DoubleNode(tape);
    if ((head) == null) {
        head = node;
        tail = node;
        current = node;
    }else {
        tail.setNext(node);
        node.setPrev(tail);
        tail = node;
        current = tail;
    }
}