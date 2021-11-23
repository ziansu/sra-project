public void addFront(int nodeData) {
    if (isEmpty()) {
        createNewHeadNode(nodeData);
    }else {
        com.colabug.Node node = new com.colabug.Node(nodeData, head.next);
        head = node;
    }
    (size)++;
}