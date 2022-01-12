public void enqueue(Item item) {
    queues.RandomizedQueue<Item>.Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty())
        first = last;
    else
        oldLast.next = last;
    
}