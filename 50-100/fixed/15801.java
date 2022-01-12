public void enqueue(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if ((last) == ((queue.length) - 1)) {
        resize((2 * (queue.length)));
    }
    queue[((last)++)] = item;
}