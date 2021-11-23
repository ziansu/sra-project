private java.lang.String add(java.lang.String value, util.Node position) {
    model.SinglyLinkedList._Node tmp = head;
    while (((tmp.data) != null) && (!(tmp.data.equals(position)))) {
        if ((tmp.next) == null) {
            tmp.next = new model.SinglyLinkedList._Node(new util.Node(value), null);
            return null;
        }else
            tmp = tmp.next;
        
    } 
    tmp.next = new model.SinglyLinkedList._Node(new util.Node(value), null);
    return null;
}