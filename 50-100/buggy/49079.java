public void enqueue(Item item) {
    if (item == null) {
        throw new java.util.NoSuchElementException();
    }
    if ((numItems) >= (capacity)) {
        resizeArray();
    }
    myQueue[((tail)++)] = item;
    tail = (tail) % (capacity);
    (numItems)++;
}