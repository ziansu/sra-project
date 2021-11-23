public Item dequeue() throws java.lang.IndexOutOfBoundsException {
    if (isEmpty())
        throw new java.lang.IndexOutOfBoundsException("Queue underflow");
    
    Item item = arr[first];
    arr[first] = null;
    (size)--;
    (first)++;
    if ((first) == (arr.length))
        first = 0;
    
    if ((arr.length) <= ((size) / 4)) {
        resize(((size) / 2));
    }
    return item;
}