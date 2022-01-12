public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if ((n) == (q.length))
        resize((2 * (q.length)));
    
    if ((last) == ((q.length) - 1)) {
        last = 0;
        q[last] = item;
    }else
        q[(++(last))] = item;
    
    (n)++;
}