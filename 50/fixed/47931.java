private int getRoot(int p) {
    while ((id[p]) != p)
        p = id[p];
    
    return p;
}