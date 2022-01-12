public void enqueue(Item item) {
    if ((size) == (items.length))
        resize(((items.length) * 2));
    
    if ((head) == (-1))
        head = 0;
    
    if ((++(tail)) == (items.length))
        tail = 0;
    
    items[tail] = item;
    (size)++;
}