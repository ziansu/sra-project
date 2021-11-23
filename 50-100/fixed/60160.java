public boolean remove(E item) {
    if ((headLink) == null)
        return false;
    else
        if ((headLink.getItem()) == item) {
            if ((headLink.getLink()) == null)
                headLink = null;
            else
                headLink = headLink.getLink();
            
            return true;
        }else
            return headLink.remove(item);
        
    
}