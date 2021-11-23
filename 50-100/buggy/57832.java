public void enqueue(Item item) {
    if ((irem) == null)
        throw new java.lang.IllegalArgumentException();
    
    RandomizedQueue<Item>.Node node = new Node();
    node.item = item;
    node.next = null;
    if (((front) == null) && ((back) == null))
        front = back = node;
    else {
        back.next = node;
        back = back.next;
    }
}