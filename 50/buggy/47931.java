private int getRoot(int p) {
    int parent = p;
    while ((id[p]) != p)
        parent = id[p];
    
    return parent;
}