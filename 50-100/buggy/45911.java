public Item removeFirst() {
    DequeRandomizedQueue.Deque<Item>.Node<Item> current = null;
    if (isEmpty()) {
        throw new java.util.NoSuchElementException("You can't remove an Item from an empty Deque");
    }else
        if ((count) == 1) {
            Item item = first.item;
            first = null;
            (count)--;
            return item;
        }else {
            current = first;
            first = current.next;
            first.prev = null;
        }
    
    --(count);
    return current.item;
}