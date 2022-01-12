public node<E> search(E data) {
    node<E> T = root;
    int c;
    while (T != null) {
        c = T.getData().compareTo(data);
        if (c == 0)
            return T;
        else
            if (c > 0)
                T = T.getRight();
            else
                T = T.getLeft();
            
        
    } 
    return null;
}