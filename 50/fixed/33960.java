private void addBetween(Score s, DoubleLinkedList.Node predecessor, DoubleLinkedList.Node successor) {
    DoubleLinkedList.Node newest = new DoubleLinkedList.Node(s, predecessor, successor);
    predecessor.setNext(newest);
    successor.setPrevious(newest);
    (size)++;
}