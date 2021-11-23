public int getRepr(int elemIndex) {
    int parent = parents.get(elemIndex);
    if (parent == elemIndex)
        return elemIndex;
    
    while (true) {
        int grandparent = parents.get(parent);
        if (grandparent == parent)
            return parent;
        
        parents.put(elemIndex, grandparent);
        elemIndex = parent;
        parent = grandparent;
    } 
}