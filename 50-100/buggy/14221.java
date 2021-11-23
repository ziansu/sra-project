public void insert(Key x) {
    if ((capacity) == (n))
        resize(((capacity) * 2));
    
    if (contains(x))
        throw new java.lang.IllegalArgumentException("key is already in the heap");
    
    add(x, 0);
    (n)++;
}