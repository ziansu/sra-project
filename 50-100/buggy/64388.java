public void enqueue(Item item) {
    if ((n) == ((a.length) - 1))
        resize((2 * (a.length)));
    
    a[((n)++)] = item;
}