private int min(int insert, int remove, int replace) {
    if ((insert < remove) && (insert < replace))
        return insert;
    else
        if ((remove < insert) && (remove < remove))
            return remove;
        else
            return replace;
        
    
}