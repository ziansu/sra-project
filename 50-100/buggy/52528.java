public int getRepr(int elemIndex) {
    if ((elemIndex < 0) || (elemIndex >= (parents.length)))
        throw new java.lang.IndexOutOfBoundsException();
    
    int parent = parents[elemIndex];
    if (parent == elemIndex)
        return elemIndex;
    
    while (true) {
        int grandparent = parents[parent];
        if (grandparent == parent)
            return parent;
        
        parents[elemIndex] = grandparent;
        elemIndex = parent;
        parent = grandparent;
    } 
}