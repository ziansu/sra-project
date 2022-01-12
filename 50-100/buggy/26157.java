public void addFirst(Item item) {
    if (item == null)
        throw new java.lang.IllegalArgumentException();
    
    Deque<Item>.Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
    if (isEmpty())
        last = first;
    else
        oldFirst.previous = first;
    
    first.previous = null;
    (numOfItems)++;
}