public void add(com.badalchowdhary.datastructures.Node node) {
    if ((head) == null) {
        head = node;
        (count)++;
        return ;
    }
    com.badalchowdhary.datastructures.Node currentNode = head;
    while ((currentNode.getNext()) != null) {
        currentNode = currentNode.getNext();
    } 
    currentNode.setNext(node);
    (count)++;
}