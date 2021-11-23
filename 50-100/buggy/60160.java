public boolean remove(E e) {
    if ((headLink) == null)
        return false;
    else
        if ((headLink.getItem()) == e) {
            if ((headLink.getLink()) == null)
                headLink = null;
            else
                headLink = headLink.getLink();
            
            return true;
        }else
            return headLink.remove(e);
        
    
}