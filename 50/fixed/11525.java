public int indexOf(E item) {
    if ((headLink) == null)
        return -1;
    else
        return headLink.indexOf(item, 0);
    
}