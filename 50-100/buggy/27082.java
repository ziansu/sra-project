private static void cloneNodes(chapertwo.ComplexListNode head) {
    chapertwo.ComplexListNode curr = head;
    while (curr != null) {
        chapertwo.ComplexListNode cloneCurr = new chapertwo.ComplexListNode();
        cloneCurr.value = curr.value;
        cloneCurr.next = curr.next;
        cloneCurr = curr.next;
        curr = curr.next;
    } 
}