public void deleteLast() {
    if ((head) == null) {
        return ;
    }
    org.javaproject.implement.MyNode p = head;
    org.javaproject.implement.MyNode pre = head;
    while ((p.next) != null) {
        pre = p;
        p = p.next;
    } 
    if ((length) == 1) {
        head = null;
        (length)--;
    }else {
        pre.next = null;
        (length)--;
    }
}