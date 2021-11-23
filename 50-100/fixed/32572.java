public void insertLast(java.lang.Object data) {
    ds.doublylinkedlist.Node newNode = new ds.doublylinkedlist.Node();
    newNode.data = data;
    if (isEmpty()) {
        first = newNode;
    }else {
        last.next = newNode;
        newNode.previous = last;
    }
    last = newNode;
    (size)++;
}