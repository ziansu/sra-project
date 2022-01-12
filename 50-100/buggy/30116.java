public void set(int i, int j) {
    if (((i < 0) || (j < 0)) || ((j - i) < 0))
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("%d,%d < 0 ", i, j));
    
    for (int start = i; start <= j; ++start)
        set(start);
    
}