public void enqueue(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if ((last) == (queue.length)) {
        resize((2 * (queue.length)));
    }
    queue[((last)++)] = item;
}