public int size(Node<t> first) {
    int temp = 0;
    Node<t> cur = first;
    while ((cur.getNextNode()) != null) {
        temp++;
        cur = cur.getNextNode();
    } 
    return temp;
}