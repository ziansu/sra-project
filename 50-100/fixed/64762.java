public void add(java.lang.Object item) {
    Node newNode = new Node(item);
    if ((first) == null) {
        first = newNode;
    }else {
        Node now = first;
        while ((now.next) != null) {
            now = now.next;
        } 
        now.next = newNode;
        newNode.previous = now;
        (size)++;
        java.lang.System.out.println((item + " added to the end of our LinkedList!"));
    }
}