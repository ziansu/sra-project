public boolean find(long key) {
    Link start = current;
    if ((current.lData) == key)
        return true;
    
    current = current.next;
    while ((current) != start) {
        if ((current.lData) == key)
            return true;
        
        current = current.next;
    } 
    return false;
}