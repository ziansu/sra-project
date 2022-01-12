private MyLinkedList.LNode getNode(int index) {
    if (index < 0)
        index += size;
    
    MyLinkedList.LNode current = start;
    if (((size) == 1) || (index < ((size) / 2))) {
        while (index > 0) {
            current = current.next;
            index--;
        } 
    }else {
        current = last;
        while (index < ((size) - 1)) {
            current = current.prev;
            index++;
        } 
    }
    return current;
}