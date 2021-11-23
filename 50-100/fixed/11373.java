public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    if ((N) == (array.length))
        resize(((array.length) * 2));
    
    array[last] = item;
    (N)++;
    last = N;
}