public T delete(int location) {
    int i = 0;
    com.rthings.ds.LinkedList.Node tempNode = head;
    while (true) {
        if ((i >= (location - 1)) || ((tempNode.next) == null)) {
            break;
        }
        tempNode = tempNode.next;
        i++;
    } 
    com.rthings.ds.LinkedList.Node deletedNode = tempNode.next;
    T data = ((T) (deletedNode.data));
    tempNode.next = tempNode.next.next;
    deletedNode = null;
    (size)--;
    return data;
}