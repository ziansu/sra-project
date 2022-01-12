public void Traversal() {
    if ((head) == null) {
        return ;
    }else {
        Node temp;
        temp = head;
        while (temp != null) {
            java.lang.System.out.println(temp.data);
            temp = temp.next;
        } 
    }
}