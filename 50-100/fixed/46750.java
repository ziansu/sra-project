public static void removeDuplicates1(ctci.ch02.LinkedLists.Node head) {
    if (head == null)
        return ;
    
    while (head != null) {
        ctci.ch02.LinkedLists.Node prev = head;
        ctci.ch02.LinkedLists.Node n = head.next;
        while (n != null) {
            if ((head.data) == (n.data)) {
                prev.next = n.next;
            }else {
                prev = n;
            }
            n = n.next;
        } 
        head = head.next;
    } 
}