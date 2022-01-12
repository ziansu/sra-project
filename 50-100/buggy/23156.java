public double pop() {
    double popped;
    if ((size) == 0) {
        java.lang.System.out.println("Nothing to pop!");
        return -1.2345;
    }else
        if ((size) == 1) {
            popped = tail.data;
            head = null;
            tail = null;
        }else {
            popped = tail.data;
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
        }
    
    (size)--;
    return popped;
}