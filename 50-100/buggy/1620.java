public void addLast(int x) {
    if ((head) == null) {
        head = new Node(x);
        (size)++;
    }else {
        Node n = new Node(x);
        Node current = head;
        while ((current.getNext()) != null) {
            current = current.getNext();
        } 
        current.setNext(n);
        (size)++;
    }
}