public int indexOf(E e) {
    if ((headLink) == null)
        return -1;
    else
        return headLink.indexOf(e, 0);
    
}