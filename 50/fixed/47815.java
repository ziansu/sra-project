public void traverse() {
    Node temp = head;
    while (temp != null) {
        java.lang.System.out.println(temp.getData());
        temp = temp.getNext();
    } 
}