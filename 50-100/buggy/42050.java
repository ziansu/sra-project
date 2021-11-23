public node<E> search(node<E> T, E data) {
    if (T == null)
        return null;
    
    int c = T.getData().compareTo(data);
    if (c == 0)
        return T;
    
    if (c > 0)
        search(T.getRight(), data);
    else
        search(T.getLeft(), data);
    
    return null;
}