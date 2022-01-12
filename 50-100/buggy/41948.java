public node<E> parentSearch(E data) {
    node<E> T = root;
    node<E> T2 = null;
    int c;
    while (T != null) {
        T2 = T;
        c = T.getData().compareTo(data);
        if (c == 0)
            return null;
        else
            if (c > 0)
                T = T.getRight();
            else
                T = T.getLeft();
            
        
    } 
    return T2;
}