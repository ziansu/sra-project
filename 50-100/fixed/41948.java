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
                T = T.getLeft();
            else
                T = T.getRight();
            
        
    } 
    return T2;
}