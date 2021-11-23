public void addFirst(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if ((n) == (q.length))
        resize((2 * (q.length)));
    
    if ((first) == 0) {
        first = (q.length) - 1;
        q[first] = item;
    }else
        q[(--(first))] = item;
    
    (n)++;
}