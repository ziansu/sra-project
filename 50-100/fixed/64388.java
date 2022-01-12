public void enqueue(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if ((n) == ((a.length) - 1))
        resize((2 * (a.length)));
    
    a[((n)++)] = item;
}