public void traverse() {
    Node temp = head;
    while (temp != null) {
        java.lang.System.out.println(temp.next.getData(temp));
        temp = temp.getNext();
    } 
}