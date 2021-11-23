public Item dequeue() {
    if ((size) == 0)
        throw new java.util.NoSuchElementException("Queue is empty!");
    
    Item item = items[((head)++)];
    if ((head) == (items.length))
        head = 0;
    
    (size)--;
    return item;
}