public cpsc457.LinkedList.Node<T> get(int index) {
    if (index > ((size) - 1)) {
        return null;
    }else {
        cpsc457.LinkedList.Node<T> n = head;
        for (int i = 0; i <= index; i++) {
            n = n.next;
        }
        return n;
    }
}