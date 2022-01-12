public void enqueue(Item item) {
    if (isEmpty())
        first = last = new Node(item);
    else {
        queues.RandomizedQueue<Item>.Node oldLast = last;
        last = new Node(item);
        oldLast.next = last;
    }
}