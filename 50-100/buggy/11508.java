public void enqueue(Item item) {
    if ((size) == (arr.length)) {
        resize((2 * (size)));
    }
    arr[((last)++)] = item;
    (size)++;
    if ((last) == (arr.length))
        last = 0;
    
}