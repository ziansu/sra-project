public void insertListAfter(int index, com.hackbulgaria.programming51.week5.LinkedList<T> l) {
    l = copy(l);
    if ((l.size()) == 0)
        return ;
    
    if (((size()) - 1) == index) {
        tail.next = l.head;
        tail = l.tail;
    }else {
        com.hackbulgaria.programming51.week5.Node<T> node = getElement(index);
        l.tail.next = node.next;
        node.next = l.head;
    }
    int newsize = size();
    newsize += l.size();
}