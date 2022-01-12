public void printList() {
    while ((head) != null) {
        java.lang.System.out.print(head.data);
        head = head.next;
    } 
    java.lang.System.out.println();
}