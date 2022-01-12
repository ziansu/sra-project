public void enqueue(Item item) {
    if ((size) == (arr.length)) {
        resize((2 * (arr.length)));
    }
    arr[((last)++)] = item;
    (size)++;
    if ((last) == (arr.length))
        last = 0;
    
}