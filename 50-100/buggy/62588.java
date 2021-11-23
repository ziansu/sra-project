public boolean add(java.lang.String x) {
    try {
        DLLNode newHead = new DLLNode(x);
        newLead.setNext(head);
        head.setPrev(newHead);
        head = newHead;
        (size)++;
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}