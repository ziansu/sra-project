public Item dequeue() {
    if ((size()) == 0)
        throw new java.util.NoSuchElementException("Queue is empty!");
    
    Item item;
    if ((head) == (tail)) {
        item = items[head];
        head = -1;
        tail = -1;
    }else {
        item = items[head];
        (head)++;
    }
    return item;
}