public void rInsert(E data) {
    node<E> parent = rParentSearch(data);
    node<E> leaf = new node(data);
    int c = parent.getData().compareTo(data);
    if (c > 0)
        parent.setLeft(leaf);
    else
        if (c < 0)
            parent.setRight(leaf);
        
    
}