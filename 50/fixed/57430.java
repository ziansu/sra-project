public void addFront(int nodeData) {
    if (isEmpty()) {
        createNewHeadNode(nodeData);
        return ;
    }else {
        com.colabug.Node node = new com.colabug.Node(nodeData, head);
        head = node;
    }
    (size)++;
}