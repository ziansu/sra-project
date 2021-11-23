public void addLast(Item item) {
    Deque<Item>.Node node = new Node(item, null, last);
    if ((last) != null)
        last.next = node;
    
    last = node;
    if ((first) == null)
        first = last;
    
    (count)++;
}