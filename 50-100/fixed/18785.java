public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    Deque<Item>.Node node = new Node(item, null, last);
    if ((last) != null)
        last.next = node;
    
    last = node;
    if ((first) == null)
        first = last;
    
    (count)++;
}