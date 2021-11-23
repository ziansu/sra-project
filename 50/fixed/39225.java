@java.lang.Override
public void clear() {
    week3.linkedList.MyLinkedList.Node tmp = head;
    while ((tmp.getNext()) != null) {
        tmp = tmp.getNext();
        head = null;
        head = tmp;
    } 
    size = 0;
}