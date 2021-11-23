public com.skoohgoli.java201.MyLinkedList add(com.skoohgoli.java201.Node node) {
    if ((head) == null) {
        head = node;
    }else {
        com.skoohgoli.java201.Node last = head;
        while ((last.next) != null) {
            last = head.next;
        } 
        last.next = node;
    }
    return this;
}