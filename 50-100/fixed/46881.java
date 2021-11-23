public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if ((n) == (q.length))
        resize((2 * (q.length)));
    
    last = ((last) + 1) % (q.length);
    q[last] = item;
    (n)++;
}