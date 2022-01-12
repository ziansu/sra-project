public void remove(Node node) {
    if ((node == (tail)) && (node == (head))) {
        head = null;
        tail = null;
    }else
        if (node == (tail)) {
            tail = tail.prev;
            tail.next = null;
        }else
            if (node == (head)) {
                head = head.next;
                head.prev = null;
            }else {
                node.next.prev = node.prev;
                node.prev.next = node.next;
            }
        
    
    node.next = null;
    node.prev = null;
    (length)--;
}