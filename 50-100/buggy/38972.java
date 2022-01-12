T value_n_from_end(int n) {
    if (((size) == 0) || (((size) - n) < 0)) {
        return null;
    }
    SNode<T> traverse = head;
    int counter = 0;
    while (counter != ((size) - n)) {
        traverse = traverse.next;
        counter++;
    } 
    return traverse.value;
}