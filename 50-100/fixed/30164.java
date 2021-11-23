public void enqueue(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if (isEmpty())
        first = last = new Node(item);
    else {
        queues.RandomizedQueue<Item>.Node oldLast = last;
        last = new Node(item);
        oldLast.next = last;
    }
}