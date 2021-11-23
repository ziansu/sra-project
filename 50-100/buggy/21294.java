public int dequeue() {
    if ((size) == 0)
        throw new IllegalException("Queue is empty");
    
    head = ((head) + 1) % (size);
    if ((head) > (tail))
        throw new IllegalException("Size underflow");
    
    int value = array[head];
    (size)--;
    return value;
}