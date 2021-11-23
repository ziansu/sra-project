private int getIndex(int r, int c) {
    if ((r - 1) == 0)
        return c;
    else
        if ((c - 1) == 0)
            return ((size) * r) - 1;
        else
            return ((size) * r) + (c - 1);
        
    
}