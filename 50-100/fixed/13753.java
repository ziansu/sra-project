public void enqueue(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    RandomizedQueue<Item>.Node newElement = new Node(item, null);
    if ((first) == null) {
        first = newElement;
    }else {
        last.next = newElement;
    }
    last = newElement;
    (size)++;
}