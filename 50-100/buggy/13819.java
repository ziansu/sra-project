void insert(int index, T value) {
    if (((size) == 0) && (index != 0)) {
        return ;
    }
    SNode<T> temp = new SNode();
    SNode<T> traverse = head;
    int counter = 0;
    temp.value = value;
    while (counter != (index - 1)) {
        traverse = traverse.next;
        counter++;
    } 
    temp.next = traverse.next.next;
    traverse.next = temp;
    (size)++;
}