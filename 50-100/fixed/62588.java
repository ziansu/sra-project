public boolean add(java.lang.String x) {
    try {
        if ((size) == 0) {
            DLLNode newHead = new DLLNode(x, null, null);
            head = newHead;
        }else {
            DLLNode newHead = new DLLNode(x);
            newHead.setNext(head);
            head.setPrev(newHead);
            head = newHead;
        }
        (size)++;
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}