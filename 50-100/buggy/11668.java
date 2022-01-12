public void removeAtIndex(int index) {
    if (index <= 0) {
        removeFirstNode();
    }else
        if (index >= ((size) - 1)) {
            removeLastNode();
        }else {
            a3.LinkedList.Node stepNode = head;
            for (int i = 1; i < index; ++i) {
                stepNode = stepNode.next;
            }
            stepNode.next = stepNode.next.next;
            stepNode = stepNode.next;
            stepNode = null;
        }
    
    --(size);
}