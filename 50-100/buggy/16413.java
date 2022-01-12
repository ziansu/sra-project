public boolean find(long key) {
    Link start = current;
    if ((current.lData) == key)
        return true;
    
    while ((current) != start) {
        current = current.next;
        if ((current.lData) == key)
            return true;
        
    } 
    return false;
}