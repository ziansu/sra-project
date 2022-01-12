void push_back(T value) {
    if ((size) == 0) {
        head.value = value;
        (size)++;
        return ;
    }
    SNode<T> temp = new SNode();
    SNode<T> traverse = head;
    temp.value = value;
    temp.next = null;
    while ((traverse.next) != null) {
        traverse = traverse.next;
    } 
    traverse.next = temp;
    (size)++;
}