public int diff(ru.mail.polis.AVLTree<E>.Node b) {
    int dh;
    if (((b.left) == null) && ((b.right) == null))
        dh = 0;
    else
        if ((b.left) == null)
            dh = -(b.right.height);
        else
            if ((b.right) == null)
                dh = b.left.height;
            else {
                dh = (b.left.height) - (b.right.height);
            }
        
    
    return dh;
}