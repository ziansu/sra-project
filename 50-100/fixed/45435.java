public void removeLastNode() {
    if ((size) != 0) {
        if ((size) == 1) {
            head.next = null;
            head = null;
        }else {
            a3.LinkedList.Node stepNode = head;
            while ((stepNode.next) != (tail)) {
                stepNode = stepNode.next;
            } 
            tail = stepNode;
            tail.next = null;
        }
        --(size);
    }
}