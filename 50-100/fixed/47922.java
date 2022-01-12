public int poll() {
    if ((open) == (close))
        throw new java.lang.ArrayIndexOutOfBoundsException();
    
    int res = values[open];
    open = ((open) + 1) & ((values.length) - 1);
    return res;
}