public int size(Node<t> first) {
    int temp = 0;
    Node<t> cur = first;
    while ((cur.getNextNode().getThisElement()) != null) {
        temp++;
        cur = cur.getNextNode();
    } 
    return temp;
}