public void insertFirst(java.lang.Object data) {
    ds.doublylinkedlist.Node newNode = new ds.doublylinkedlist.Node();
    newNode.data = data;
    if (isEmpty()) {
        last = newNode;
    }else {
        first.previous = newNode;
        newNode.next = first;
    }
    first = newNode;
    (size)++;
}